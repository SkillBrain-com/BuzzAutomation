package homework.PasaricaAndrei.testNg.t2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testNg.t1.TNG2;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TNG3 extends TNG2 {

    @Test
    public void testSuccessfulLogin() {
        driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.id("txt-username")).sendKeys("Ion");
        driver.findElement(By.id("txt-password")).sendKeys("Parola");
        driver.findElement(By.id("btn-login")).click();

        WebElement header = driver.findElement(By.xpath("//h2[text()='Make Appointment']"));
        assertTrue(header.isDisplayed());
    }

    @Test
    public void validLoginFromMenu() {
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("txt-username")).sendKeys("Ion1");
        driver.findElement(By.id("txt-password")).sendKeys("Parola1");
        driver.findElement(By.id("btn-login")).click();
        assertTrue(driver.getCurrentUrl().contains("profile"));
    }

    @Test
    public void invalidLoginFromMenu() {
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("txt-username")).sendKeys("Invalid");
        driver.findElement(By.id("txt-password")).sendKeys("Gresit");
        driver.findElement(By.id("btn-login")).click();
        assertTrue(driver.getPageSource().contains("Login failed"));
    }
}
