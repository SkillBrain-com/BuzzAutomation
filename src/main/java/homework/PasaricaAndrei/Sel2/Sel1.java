package homework.PasaricaAndrei.Sel2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Sel1 {
    public static void main(String[] args) {
        WebDriver driver = null;

        try {

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");

            WebElement notThere = driver.findElement(By.id("nu exista deloc"));

            System.out.println(notThere.getText());

        } catch (NoSuchElementException e) {
            System.out.println("Elementul nu a fost gasit se capturează un screenshot ");


            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("D:\\IT\\Screenshots");


            try {
                FileHandler.copy(screenshot, destination);
                System.out.println("Screenshot salvat D:\\IT\\Screenshots");
            } catch (IOException ex) {
                System.out.println("Eroare la salvarea screenshotului " + ex.getMessage());
            }

        } finally {
            if (driver != null) {
                driver.quit();
                System.out.println("Browserul a fost închis");
            }
        }
    }
}

