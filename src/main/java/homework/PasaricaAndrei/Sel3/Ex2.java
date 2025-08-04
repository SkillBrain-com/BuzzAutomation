package homework.PasaricaAndrei.Sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");

            driver.findElement(By.id("delaygotobasic")).click();

//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.urlContains("basic-web-page"));
//
//            String currentUrl = driver.getCurrentUrl();
//            System.out.println("Redirected to " + currentUrl);

//            if (currentUrl.contains("basic-web-page")) {
//                System.out.println("Redirect reușit");
//            } else {
//                System.out.println("Redirect EȘUAT");
//            }

            String originalWindow = driver.getWindowHandle();

            driver.findElement(By.id("delaygotobasic")).click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(driver1 -> driver1.getWindowHandles().size() > 1);

            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(originalWindow)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }

            System.out.println("Noua fereastră are URL-ul: " + driver.getCurrentUrl());

        } catch (Exception e) {
            System.out.println("Eroare în test " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}

