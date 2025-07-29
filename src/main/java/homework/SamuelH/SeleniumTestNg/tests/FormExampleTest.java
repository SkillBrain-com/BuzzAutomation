package homework.SamuelH.SeleniumTestNg.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FormExampleTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // 1. Accesăm pagina de start
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.linkText("HTML Form Example")).click();

        driver.findElement(By.name("username")).sendKeys("IonPopescu");
        driver.findElement(By.name("password")).sendKeys("parola123");

        WebElement comments = driver.findElement(By.name("comments"));
        comments.clear();
        comments.sendKeys("Acesta este un comentariu de test.");

        driver.findElement(By.cssSelector("input[value='cb1']")).click();
        driver.findElement(By.cssSelector("input[value='cb3']")).click();

        driver.findElement(By.cssSelector("input[value='rd2']")).click();

        WebElement dropdown = driver.findElement(By.name("dropdown"));
        dropdown.findElement(By.cssSelector("option[value='dd2']")).click();

        driver.findElement(By.cssSelector("input[type='submit']")).click();

        WebElement confirmation = driver.findElement(By.tagName("body"));
        if (confirmation.getText().contains("IonPopescu")) {
            System.out.println("✅ Formular completat și trimis cu succes!");
        } else {
            System.out.println("❌ Datele nu au fost procesate corect.");
        }

        driver.quit();
    }
}
