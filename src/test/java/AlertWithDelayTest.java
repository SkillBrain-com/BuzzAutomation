import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.ChromeDriverOption;
import utilities.ScreenShotService;

import java.time.Duration;

public class AlertWithDelayTest {

    private static Logger LOGGER = LoggerFactory.getLogger(AlertWithDelayTest.class);

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = ChromeDriverOption.getChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        // global timeout
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // click is too fast! => make it wait for 5 seconds

        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://demoqa.com/alerts");
            driver.findElement(By.id("timerAlertButton")).click();
            explicitWait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            e.printStackTrace();
            ScreenShotService.takeScreenshot(driver);
        } finally {
            driver.quit();
        }



    }
}
