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

public class DynamicButtonsTest {
    @Test
    public void testClickAllDynamicButtonsAndVerifyMessage() {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");

            for (int i = 1; i <= 4; i++) {
                String buttonId = "button" + i;
                WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id(buttonId)));
                button.click();
            }

            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
            String expectedMessage = "All Buttons Clicked";
            Assert.assertEquals("Mesajul final este incorect!", expectedMessage, message.getText());

        } finally {
            driver.quit();
        }
    }
}

