import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ChromeDriverOption;
import utilities.ScreenShotService;

import java.util.Iterator;
import java.util.Set;

public class BrowserWindowTest {

    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(ChromeDriverOption.getChromeOptions());

        try {
            // gecko driver
            driver.manage().window().maximize();
            // 1. got to /alerts page
            driver.get("https://demoqa.com/browser-windows");
            driver.findElement(By.xpath("//button[text() ='New Tab']")).click();
            // get all window handles (ids) - 2
            // list with unique ids (values)
            Set<String> windowHandles = driver.getWindowHandles();
            // Iterator
            Iterator<String> stringIterator = windowHandles.iterator();
            String parent = stringIterator.next(); // iterator -> move to index 0 (first element)
            String child = stringIterator.next(); // iterator -> move to index 1 (second element)
            driver.switchTo().window(child);
            String pageText = driver.findElement(By.id("sampleHeading")).getText();
            System.out.println(pageText);
            driver.switchTo().window(parent);
            ScreenShotService.takeScreenshot(driver);
            // switch focus to second id (handle)


        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            // close all browser tabs
            driver.quit();
//            close only active tab
//            driver.close();
        }


    }
}
