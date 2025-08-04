package homework.edinita.seleniumBasicPartOne_Homework;

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

    @Test(testName = "GET TEXT OF THE FIRST 2 PARAGRAPHS FROM HEROKU APP FIRST LINK")
    public void firstLinkFromHerokuApp() {
        herokuAppExemples.getToFirstExemple();
        String actualUrl = herokuAppExemples.getCurrentUrl();
        String expectedUrl = "https://testpages.eviltester.com/styled/basic-web-page-test.html";
        Assert.assertEquals(actualUrl, expectedUrl);
        herokuAppExemples.getTextParagraph(HerokuApp_Exemples.getParagraph());
        herokuAppExemples.getTextParagraph(HerokuApp_Exemples.getParagraph2());
    }

    @Test(testName = "GET TEXT OF ALL PARAGRAPHS FROM HEROKU APP SECOND LINK")
    public void secondLinkFromHerokuApp() {
        herokuAppExemples.getToSecondExemple();
        String actualUrl = herokuAppExemples.getCurrentUrl();
        String expectedUrl = "https://testpages.eviltester.com/styled/attributes-test.html";
        Assert.assertEquals(actualUrl, expectedUrl);
        herokuAppExemples.getTextParagraph(HerokuApp_Exemples.getParagraph3());
        herokuAppExemples.getTextParagraph(HerokuApp_Exemples.getParagraph4());
        herokuAppExemples.getTextParagraph(HerokuApp_Exemples.getParagraph5());
    }

    @Test(testName = "GET TEXT OF ALL PARAGRAPHS FROM HEROKU APP THIRD LINK")
    public void thirdLinkFromHerokuApp() {
        herokuAppExemples.getToThirdExemple();
        String actualUrl = herokuAppExemples.getCurrentUrl();
        String expectedUrl = "https://testpages.eviltester.com/styled/find-by-playground-test.html#pName1";
        Assert.assertEquals(actualUrl, expectedUrl);
        herokuAppExemples.getTextFromListOfParagraphs();
    }

    @Test(testName = "GET TEXT OF ALL PARAGRAPHS FROM HEROKU APP FORTH LINK")
    public void forthLinkFromHerokuApp() {
        herokuAppExemples.getToForthExemple();
        String actualUrl = herokuAppExemples.getCurrentUrl();
        String expectedUrl = "https://testpages.eviltester.com/styled/webdriver-example-page?number-entry=one%2C+two";
        Assert.assertEquals(actualUrl, expectedUrl);
        herokuAppExemples.getTextParagraph(HerokuApp_Exemples.getParagraph6());
        herokuAppExemples.getTextParagraph(HerokuApp_Exemples.getParagraph7());
        herokuAppExemples.getTextFromListOfItems();
        herokuAppExemples.addKeysToNumberEntry("1,2,3,4");
        herokuAppExemples.clickShowAsParagraphButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        herokuAppExemples.getTextParagraph(HerokuApp_Exemples.getMessageParagraph());
    }

    @AfterTest
    public void finalizeTest() {
        LOGGER.info("Test ended, closing driver...");
        ScreenShot_Service.takeScreenshot(driver);
        driver.quit();
    }
}
