package homework.GabrielaDumitru.Selenium.java.Tema4Selenium.java.com.skillbrain.ticket_types_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.time.Duration;

public class TicketTypeTests extends BaseTest {

    private final String ticketUrl = "https://web02.stg.oveit.com/seller/ticket_types_new?id_event=8619";

    private void openTicketPage() {
        driver.get(ticketUrl);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("ticket_type_name")));
    }

    @Test
    public void testPageLoad() {
        openTicketPage();
        Assert.assertTrue(driver.findElement(By.id("ticket_type_name")).isDisplayed());
    }

    @Test
    public void testRequiredFieldsValidation() {
        openTicketPage();
        driver.findElement(By.id("save_button")).click();

        WebElement nameError = driver.findElement(By.cssSelector("span.error[for='ticket_type_name']"));
        Assert.assertTrue(nameError.isDisplayed());
    }

    @Test
    public void testCreateValidTicket() {
        openTicketPage();
        driver.findElement(By.id("ticket_type_name")).sendKeys("General Access");
        driver.findElement(By.id("ticket_type_price")).sendKeys("100");
        driver.findElement(By.id("ticket_type_quantity")).sendKeys("100");
        driver.findElement(By.id("ticket_type_start_date")).sendKeys("2025-07-20");
        driver.findElement(By.id("ticket_type_end_date")).sendKeys("2025-07-25");

        driver.findElement(By.id("save_button")).click();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.urlContains("ticket_types"));

        Assert.assertTrue(driver.getPageSource().contains("General Access"));
    }

    @Test
    public void testInvalidPriceNegativeValue() {
        openTicketPage();
        driver.findElement(By.id("ticket_type_name")).sendKeys("Negative Price");
        driver.findElement(By.id("ticket_type_price")).sendKeys("-50");
        driver.findElement(By.id("ticket_type_quantity")).sendKeys("100");
        driver.findElement(By.id("ticket_type_start_date")).sendKeys("2025-07-20");
        driver.findElement(By.id("ticket_type_end_date")).sendKeys("2025-07-25");
        driver.findElement(By.id("save_button")).click();

        String priceValue = driver.findElement(By.id("ticket_type_price")).getAttribute("value");
        Assert.assertNotEquals(priceValue, "Free");
    }

    @Test
    public void testInvalidDateRange() {
        openTicketPage();
        driver.findElement(By.id("ticket_type_start_date")).sendKeys("2025-08-01");
        driver.findElement(By.id("ticket_type_end_date")).sendKeys("2025-07-25");
        driver.findElement(By.id("save_button")).click();

        String pageSource = driver.getPageSource().toLowerCase();
        Assert.assertTrue(pageSource.contains("invalid date") || pageSource.contains("end date must be after"));
    }

    @Test
    public void testInvalidQuantityZeroOrNegative() {
        openTicketPage();
        WebElement quantity = driver.findElement(By.id("ticket_type_quantity"));
        quantity.clear();
        quantity.sendKeys("0");
        driver.findElement(By.id("save_button")).click();

        String pageSource = driver.getPageSource().toLowerCase();
        Assert.assertTrue(pageSource.contains("invalid quantity") || quantity.getAttribute("value").equals("0"));
    }

    @Test
    public void testVeryLargeQuantity() {
        openTicketPage();
        WebElement quantity = driver.findElement(By.id("ticket_type_quantity"));
        quantity.clear();
        quantity.sendKeys("500000000");
        driver.findElement(By.id("save_button")).click();

        String qtyValue = quantity.getAttribute("value");
        Assert.assertEquals(qtyValue, "65535");
    }
}
