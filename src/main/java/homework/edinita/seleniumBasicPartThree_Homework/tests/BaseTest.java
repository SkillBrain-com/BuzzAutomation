package homework.edinita.seleniumBasicPartThree_Homework.tests;

import demoTestNG.driver.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.NoSuchElementException;

public class BaseTest {
    protected ChromeDriver driver = null;
    @BeforeMethod(onlyForGroups = {"first_page"})
    public void beforeMethod() {
        driver = WebDriverConfig.getChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
    }
    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }
    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    protected boolean isElementPresent(WebElement element, By locator) {
        try {
            element.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    protected FluentWait<ChromeDriver> getWait(ChromeDriver driver) {
        return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(100));
    }
}
