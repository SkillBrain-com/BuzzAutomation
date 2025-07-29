package homework.SamuelH.SeleniumTestNg.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class BrowserWindowsTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/browser-windows");

        String mainWindowHandle = driver.getWindowHandle();

        driver.findElement(By.id("tabButton")).click();
        switchToNewWindow(driver, mainWindowHandle);
        System.out.println("NEW TAB CONTENT: " + driver.findElement(By.id("sampleHeading")).getText());
        driver.close(); // Închide tab-ul nou
        driver.switchTo().window(mainWindowHandle); // Revenim

        driver.findElement(By.id("windowButton")).click();
        switchToNewWindow(driver, mainWindowHandle);
        System.out.println("NEW WINDOW CONTENT: " + driver.findElement(By.id("sampleHeading")).getText());
        driver.close(); // Închide fereastra nouă
        driver.switchTo().window(mainWindowHandle); // Revenim

        driver.findElement(By.id("messageWindowButton")).click();
        switchToNewWindow(driver, mainWindowHandle);
        WebElement body = driver.findElement(By.tagName("body"));
        System.out.println("WINDOW MESSAGE CONTENT: " + body.getText());
        driver.close();
        driver.switchTo().window(mainWindowHandle);


        driver.quit();
    }


    public static void switchToNewWindow(WebDriver driver, String originalHandle) {
        Set<String> allWindows = driver.getWindowHandles();
        for (String handle : allWindows) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }
}

