package homework.edinita.demoSelenium3.tests;

import demoSelenium3.driver.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    protected ChromeDriver driver = null;
    @BeforeClass
    public void init() {
        driver = BrowserConfig.getChromeDriver();
    }
    @AfterClass(alwaysRun = true)
    public void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }
    protected FluentWait<ChromeDriver> getWait(ChromeDriver driver) {
        return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofMillis(500));
    }
    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
