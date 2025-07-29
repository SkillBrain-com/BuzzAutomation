package homework.SamuelH.SeleniumTestNg.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class BrowserWindowsTryCatchTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String mainWindowHandle = null;

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/browser-windows");
            mainWindowHandle = driver.getWindowHandle();

            driver.findElement(By.id("tabButton")).click();
            switchToNewWindow(driver, mainWindowHandle);
            try {
                WebElement missing = driver.findElement(By.id("elementCareNuExistaTab"));
            } catch (NoSuchElementException e) {
                takeScreenshot(driver, "error_new_tab.png");
                System.out.println("Element inexistent în tab nou - Screenshot salvat.");
            }
            driver.close();
            driver.switchTo().window(mainWindowHandle);

            driver.findElement(By.id("windowButton")).click();
            switchToNewWindow(driver, mainWindowHandle);
            try {
                WebElement missing = driver.findElement(By.id("elementCareNuExistaWindow"));
            } catch (NoSuchElementException e) {
                takeScreenshot(driver, "error_new_window.png");
                System.out.println("Element inexistent în fereastra nouă - Screenshot salvat.");
            }
            driver.close();
            driver.switchTo().window(mainWindowHandle);

            driver.findElement(By.id("messageWindowButton")).click();
            switchToNewWindow(driver, mainWindowHandle);
            try {
                WebElement missing = driver.findElement(By.id("elementInexistentMesaj"));
            } catch (NoSuchElementException e) {
                takeScreenshot(driver, "error_message_window.png");
                System.out.println("Element inexistent în mesaj - Screenshot salvat.");
            }
            driver.close();
            driver.switchTo().window(mainWindowHandle);

        } catch (Exception e) {
            System.out.println("Eroare generală: " + e.getMessage());
        } finally {

            driver.quit();
            System.out.println("Browser închis.");
        }
    }

    public static void switchToNewWindow(WebDriver driver, String mainHandle) {
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.equals(mainHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }

    public static void takeScreenshot(WebDriver driver, String filename) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(System.getProperty("user.dir") + "/" + filename);
        try {
            FileHandler.copy(srcFile, destFile);
        } catch (IOException e) {
            System.out.println("Eroare la salvarea screenshot-ului: " + e.getMessage());
        }
    }
}
