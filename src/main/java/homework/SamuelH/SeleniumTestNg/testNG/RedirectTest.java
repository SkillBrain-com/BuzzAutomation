package homework.SamuelH.SeleniumTestNg.testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RedirectTest {

        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();

            try {
                driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");

                WebElement redirectButton = driver.findElement(By.id("delaygotobasic"));
                redirectButton.click();

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.urlContains("basic-web-page"));

                String currentUrl = driver.getCurrentUrl();
                System.out.println("Redirectat către: " + currentUrl);

                if (currentUrl.contains("basic-web-page")) {
                    System.out.println("✅ Redirect reușit!");
                } else {
                    System.out.println("❌ Redirect EȘUAT!");
                }

            } finally {
                driver.quit();
            }
        }
    }

