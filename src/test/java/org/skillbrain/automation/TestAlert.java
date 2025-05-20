package org.skillbrain.automation;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AlertPageObject;
import utilities.ScreenShotService;

public class TestAlert {

    private WebDriver driver;
    private DriverFactory driverFactory;
    private AlertPageObject alertPageObject;
    private static Logger LOGGER = LoggerFactory.getLogger(TestAlert.class);

    @BeforeTest
    public void initTest() {
        LOGGER.info("Executing Before Test Method...");
        driverFactory = new DriverFactory();
        driver = driverFactory.getDriver();
        alertPageObject = new AlertPageObject(driver);
        LOGGER.info("Finished initializing test.");
    }

    @Test(testName = "First alert test", groups = "Group1")
    public void alertTest() {
        alertPageObject.goToAlertPage();
        String actualUrl = alertPageObject.currentUrl();
        String expectedUrl = "https://demoqa.com/alerts";
        // First check -> check URL is correct
        Assert.assertEquals(actualUrl, expectedUrl);
        alertPageObject.clickOnClickMe();
        driver.switchTo().alert().accept();
    }

    @Test(groups = "Group1")
    public void secondAlertTest() {
        alertPageObject.goToAlertPage();
        alertPageObject.clickOnConfirmButton();
        alertPageObject.conformOrReject("yes");
        Assert.assertEquals(alertPageObject.getConfirmMessage(), "You selected Ok");
    }

    @Test(groups = "Group2")
    public void thirdAlertTest() {
        alertPageObject.goToAlertPage();
        alertPageObject.clickPromptButton();
        String originalMessage = "This is a test";
        alertPageObject.thirdAlertPrompt(originalMessage, true);
        Assert.assertEquals(alertPageObject.getPromptResult(), "You entered " + originalMessage);
    }

    @AfterTest
    public void finalizeTest() {
        LOGGER.info("Test ended, closing driver...");
        ScreenShotService.takeScreenshot(driver);
        driver.quit();
    }

}
