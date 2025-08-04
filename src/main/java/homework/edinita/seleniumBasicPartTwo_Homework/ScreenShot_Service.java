package homework.edinita.seleniumBasicPartTwo_Homework;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

public class ScreenShot_Service {
    private static Logger LOGGER = LoggerFactory.getLogger(ScreenShot_Service.class);

    public static void takeScreenshot(WebDriver driver) {
        String destinationString = null;
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        String destionationString = System.getProperty("user.dir") + "/report/screenshots/Test-" + LocalTime.now() + ".png";
        File destionationFile = new File(destionationString);

        try {
            FileUtils.copyFile(sourceFile, destionationFile);
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong when taking screenshot");
        }
    }
}
