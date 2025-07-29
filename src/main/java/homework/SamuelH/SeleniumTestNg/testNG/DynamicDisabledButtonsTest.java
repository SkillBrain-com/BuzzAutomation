package homework.SamuelH.SeleniumTestNg.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicDisabledButtonsTest {
    @Test
    public void testClickAllDisabledButtonsAndVerifyMessage() {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");

            String[] buttonIds = {"button00", "button01", "button02", "button03"};

            for (String buttonId : buttonIds) {
                wait.until(ExpectedConditions.elementToBeClickable(By.id(buttonId)));

                WebElement button = driver.findElement(By.id(buttonId));
                button.click();
            }

            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
            Assert.assertEquals("All Buttons Clicked", message.getText());

        } finally {
            driver.quit();
        }
    }
}

