package homework.PasaricaAndrei.Sel3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class Ex1 {

    @Test
    public void testAjaxDropdownSelection() {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            Select categorySelect = new Select(driver.findElement(By.id("combo1")));
            categorySelect.selectByVisibleText("Server");

            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("combo2"), "Java"));

            Select languageSelect = new Select(driver.findElement(By.id("combo2")));
            languageSelect.selectByVisibleText("Java");

            driver.findElement(By.name("submitbutton")).click();

            String categoryResult = driver.findElement(By.id("_valueid")).getText();
            String languageResult = driver.findElement(By.id("_valuelanguage_id")).getText();

            assertEquals("3", categoryResult);
            assertEquals("23", languageResult);

        } finally {
            driver.quit();
        }
    }
}

