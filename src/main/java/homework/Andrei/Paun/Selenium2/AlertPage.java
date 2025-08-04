package homework.Andrei.Paun.Selenium2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertPage {

    private static final String URL = "https://testpages.eviltester.com/styled/alerts/alert-test.html";
    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        WebElement Alert = driver.findElement(By.xpath("//input[@id='alertexamples']"));
        Alert.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        {
            try {
                org.openqa.selenium.Alert alert = driver.switchTo().alert();
                alert.accept();
                Thread.sleep(2000);



            } catch (Exception e) {
                e.printStackTrace();

            } driver.quit();
        }



    }




}
