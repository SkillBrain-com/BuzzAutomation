package homework.GabrielaDumitru.Selenium.java.Tema4Selenium.java.com.skillbrain.ticket_types_new;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
public class LoginHelper {



        private WebDriver driver;

        public LoginHelper(WebDriver driver) {
            this.driver = driver;
        }

        public void loginValidUser() {
            driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
            driver.findElement(By.id("txt-username")).sendKeys("John Doe");
            driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
            driver.findElement(By.id("btn-login")).click();

            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-toggle")));
        }
    }


