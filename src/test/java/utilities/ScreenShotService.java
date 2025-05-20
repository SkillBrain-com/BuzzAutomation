package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

public class ScreenShotService {


    public static void takeScreenshot(WebDriver driver) {
        String destinationString = null;
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        destinationString =
                System.getProperty("user.dir") + "/report/screenshots/Test-" + LocalTime.now() + ".png";
        File destinationFile = new File(destinationString);

        try {
            FileUtils.copyFile(sourceFile, destinationFile);
        } catch (IOException ioException) {
            ioException.printStackTrace();
            throw new RuntimeException("Something went wrong when taking screenshot");
        }


    }

}
