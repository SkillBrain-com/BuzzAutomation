package homework.SamuelH.SeleniumTestNg.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoQATest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/elements");

        driver.findElement(By.xpath("//span[text()='Text Box']")).click();
        driver.findElement(By.id("userName")).sendKeys("Ion Popescu");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("ion@example.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Str. Exemplu 12");
        driver.findElement(By.cssSelector("textarea#permanentAddress")).sendKeys("Bucuresti");
        driver.findElement(By.id("submit")).click();

        driver.findElement(By.xpath("//span[text()='Check Box']")).click();
        driver.findElement(By.cssSelector("button[title='Expand all']")).click();
        driver.findElement(By.xpath("//label[@for='tree-node-desktop']")).click();
        driver.findElement(By.xpath("//label[@for='tree-node-downloads']")).click();

        driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
        driver.findElement(By.cssSelector("label[for='yesRadio']")).click();
        driver.findElement(By.cssSelector("label[for='impressiveRadio']")).click();

        driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys("Maria");
        driver.findElement(By.id("lastName")).sendKeys("Ionescu");
        driver.findElement(By.id("userEmail")).sendKeys("maria@test.com");
        driver.findElement(By.id("age")).sendKeys("30");
        driver.findElement(By.id("salary")).sendKeys("7000");
        driver.findElement(By.id("department")).sendKeys("QA");
        driver.findElement(By.id("submit")).click();

        driver.findElement(By.xpath("//span[text()='Links']")).click();
        driver.findElement(By.id("simpleLink")).click(); // deschide în tab nou
        driver.findElement(By.linkText("Home")).click(); // tot tab nou

        driver.quit();
    }
}

