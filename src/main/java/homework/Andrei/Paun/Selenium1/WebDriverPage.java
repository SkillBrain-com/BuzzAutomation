package homework.Andrei.Paun.Selenium1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPage {
    public static final String Url = "https://testpages.herokuapp.com/styled/index.html";

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Url);


        WebElement Link4 = driver.findElement(By.id("webdriverexamplepage"));
        Link4.click();


        // Introduce cifra 1
        WebElement input = driver.findElement(By.xpath("//input[@id='numentry']"));
        input.sendKeys("1");

        // Click pe butonul "Show as Para" (sau "Show as Alert" dacă vrei alertă)
        WebElement showAsPara = driver.findElement(By.id("show-as-para"));
        showAsPara.click();

        // Aici poți verifica dacă apare textul "one" în pagină (exemplu pentru paragraf)
        WebElement result = driver.findElement(By.xpath("//p[contains(text(),'one')]"));
        System.out.println("Textul convertit: " + result.getText());

    }
}
