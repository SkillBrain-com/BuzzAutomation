package homework.GabrielaDumitru.Selenium.java.Tema3Selenium.java.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class HtmlFormsTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

            WebElement username = driver.findElement(By.name("username"));
            username.sendKeys("user123");

            WebElement nonExisting = driver.findElement(By.id("does-not-exist"));

        } catch (NoSuchElementException e) {
            takeScreenshot(driver, "htmlforms_error.png");
        } finally {
            driver.quit();
        }
    }

    public static void takeScreenshot(WebDriver driver, String fileName) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            File dest = new File("screenshots/" + fileName);
            dest.getParentFile().mkdirs();
            org.apache.commons.io.FileUtils.copyFile(src, dest);
            System.out.println("Screenshot salvat: " + dest.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
