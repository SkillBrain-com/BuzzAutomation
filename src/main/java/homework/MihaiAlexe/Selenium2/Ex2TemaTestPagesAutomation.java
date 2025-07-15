package homework.MihaiAlexe.Selenium2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Ex2TemaTestPagesAutomation {

    public static void main(String[] args) {
        ChromeDriver driver = createDriverAndGetPage();

        try {
            WebElement element = driver.findElement(By.name("birthDate"));

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
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        return driver;
    }
}
