package homework.andreiB.homework.selenium2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsPageTest {

    private static final String URL = "https://testpages.eviltester.com/styled/alerts/alert-test.html";
    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        WebElement alerts = driver.findElement(By.xpath("//input[@id='alertexamples']"));
        alerts.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
            Thread.sleep(1000);



        } catch (Exception e) {
            e.printStackTrace();

        } driver.quit();

    }

}


