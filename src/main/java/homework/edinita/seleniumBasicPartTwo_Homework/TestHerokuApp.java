package homework.edinita.seleniumBasicPartTwo_Homework;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestHerokuApp {
    private WebDriver driver;
    private Setup_Driver setupDriver;
    private HerokuApp_Exemples herokuAppExemples;
    private static Logger LOGGER = LoggerFactory.getLogger(TestHerokuApp.class);

    @BeforeTest
    public void initTest() {
        LOGGER.info("Executing Before Test Method...");
        setupDriver = new Setup_Driver();
        driver = setupDriver.getDriverFromConfigFile();
        herokuAppExemples = new HerokuApp_Exemples(driver);
        LOGGER.info("Finished initializing test.");
    }

    @Test(testName = "ALERT BOX WITH PROMPT BOX WITH ACCEPT AND DISMISS")
    public void firstLinkFromHerokuApp() {
        herokuAppExemples.goToPromptBoxAlert();
        String actualUrl = herokuAppExemples.getCurrentUrl();
        String expectedUrl = "https://testpages.eviltester.com/styled/alerts/alert-test.html";
        Assert.assertEquals(actualUrl, expectedUrl);
        herokuAppExemples.acceptAndDismissAlert();
    }
    @Test(testName = "FAKE ALERT OPEN AND CLOSE BY CLICKING ON OK BUTTON OR CLICKING ON THE BACKGROUND")
    public void secondLinkFromHerokuApp() {
        herokuAppExemples.goToFakeAlert();
        String actualUrl = herokuAppExemples.getCurrentUrl();
        String expectedUrl = "https://testpages.eviltester.com/styled/alerts/fake-alert-test.html";
        Assert.assertEquals(actualUrl, expectedUrl);
        herokuAppExemples.openAndCloseFakeAlert();
    }
    @Test(testName = "FILL IN THE FORM WITH CALENDAR DETAILS")
    public void thirdLinkFromHerokuApp() {
        herokuAppExemples.goToFormFirstWindow();
        String actualUrl = herokuAppExemples.getCurrentUrl();
        String expectedUrl = "https://testpages.eviltester.com/styled/html5-form-test.html";
        Assert.assertEquals(actualUrl, expectedUrl);
        herokuAppExemples.fillFromDetails();
    }
    @Test(testName = "SWITCH FOCUS ON DIFFERENT TABS")
    public void fourthLinkFromHerokuApp() {
        herokuAppExemples.goToFormSecondWindow();
        String actualUrl = herokuAppExemples.getCurrentUrl();
        String expectedUrl = "https://testpages.eviltester.com/styled/windows-test.html";
        Assert.assertEquals(actualUrl, expectedUrl);
        herokuAppExemples.clickOnFirstJumpLink();
        herokuAppExemples.switchToNewTab();
        herokuAppExemples.goBackToParentWindow();
    }
    @Test(testName = "TAKE A SCREENSHOT WHEN ELEMENT IS NOT FOUND")
    public void noSuchElementExceptionPrintScreen() {
        herokuAppExemples.printScreenNoSuchElementException();
    }

    @AfterTest
    public void finalizeTest() {
        LOGGER.info("Test ended, closing driver...");
        ScreenShot_Service.takeScreenshot(driver);
        driver.quit();
    }
}
