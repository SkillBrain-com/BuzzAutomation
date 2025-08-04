package homework.PasaricaAndrei.Sel2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Sel4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://demoqa.com/browser-windows");

            WebElement invalidElement = driver.findElement(By.id("acest id nu exista"));

            invalidElement.click();

        } catch (NoSuchElementException e) {
            System.out.println("Elementul nu a fost găsit se realizează un screenshot");

            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("D:\\IT\\ScreenshotsIntelij");

            try {
                Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Screenshot salvat la " + destination.getAbsolutePath());
            } catch (IOException ioException) {
                System.out.println("Eroare la salvarea screenshotului " + ioException.getMessage());
            }

        } finally {
            driver.quit();
            System.out.println("Browserul a fost închis");
        }
    }
}

