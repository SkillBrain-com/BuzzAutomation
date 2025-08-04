package homework.Marco.Selenium2;

import SeleniumDemo2.BrowserManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class BrowserWindows {

    public static void main(String[] args) throws IOException {
        WindowsButtons();
    }

    public static void WindowsButtons() throws IOException {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://demoqa.com/browser-windows");

            WebElement tabButton = driver.findElement(By.id("tabButton"));
            WebElement windowButton = driver.findElement(By.id("windowButton"));
            WebElement windowMessage = driver.findElement(By.id("messageWindowButton"));
            WebElement fakeWindow = driver.findElement(By.id("fakeWindow"));

//            tabButton.click();
//            windowButton.click();
            windowMessage.click();

            String parentWindow = driver.getWindowHandle();
            Set<String> windowHandles = driver.getWindowHandles();

            for (String window: windowHandles) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }

//            System.out.println(driver.findElement(By.id("sampleHeading")).getText());              ------>tabButton
            System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            System.out.println(driver.findElement(By.id("//body[contains(text(), 'Knowledge')]")).getText());
            driver.close();

        }catch (Exception| Error e) {
            if (driver != null) {
                File file = driver.getScreenshotAs(OutputType.FILE);
                File destFile = new File("C:\\Users\\marco\\OneDrive\\Desktop\\Cursuri IT\\FakeWindow.png");
                FileUtils.copyFile(file,destFile);
            }
        }finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
