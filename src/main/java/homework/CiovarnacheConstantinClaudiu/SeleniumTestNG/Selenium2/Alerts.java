package homework.CiovarnacheConstantinClaudiu.SeleniumTestNG.Selenium2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Alerts {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        try {
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

            clickButtonAndHandleAlert(driver, By.id("alertexamples"), "alert1.png", true);
            clickButtonAndHandleAlert(driver, By.id("confirmexample"), "alert2.png", true);
            clickButtonAndHandleAlert(driver, By.id("promptexample"), "alert3.png", true);

        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }

    public static void clickButtonAndHandleAlert(WebDriver driver, By buttonLocator, String screenshotName, boolean acceptAlert) throws InterruptedException, IOException {
        WebElement button = driver.findElement(buttonLocator);

        takeScreenshot(driver, screenshotName);


        button.click();


        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();

        if (acceptAlert) {
            alert.accept();
        } else {
            alert.dismiss();
        }

        Thread.sleep(1000);
    }

    public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("./screenshots/" + fileName);
        destFile.getParentFile().mkdirs();
        Files.copy(srcFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
