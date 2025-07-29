package homework.GabrielaDumitru.Selenium.java.Tema4Selenium.java.com.skillbrain.ticket_types_new;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
public class BaseTest {




        protected WebDriver driver;

        @Parameters({"profile"})
        @BeforeMethod
        public void setup(String profile) {
            driver = DriverManager.getDriver(profile);
        }

        @AfterMethod
        public void teardown(ITestResult result) {
            if (ITestResult.FAILURE == result.getStatus()) {
                takeScreenshot(result.getName());
            }
            DriverManager.quitDriver();
        }

        public void takeScreenshot(String testName) {
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(srcFile, new File("screenshots/" + testName + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


