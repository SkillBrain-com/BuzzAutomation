package homework.MihaiAlexe.Selenium2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Ex3TemaTestPagesAutomation {

    public static void main(String[] args) {
        ChromeDriver driver = createDriverAndGetPage();

        try {
            WebElement element = driver.findElement(By.id("login"));

        } catch (NoSuchElementException e) {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshot, new File("C:\\MIHAI\\temaSelenium2\\screenshots\\screenshot.png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            System.out.println("Elementul nu a fost găsit. Screenshot salvat în C:\\MIHAI\\temaSelenium2\\screenshots");
        } finally {
            driver.quit();
        }
    }

    public static ChromeDriver createDriverAndGetPage() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        return driver;
    }
}
