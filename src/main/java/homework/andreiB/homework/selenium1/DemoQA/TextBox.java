package homework.andreiB.homework.selenium1.DemoQA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

    private static final String URL = "https://demoqa.com/";
    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        WebElement elements = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]/div[1]"));
        elements.click();
        Thread.sleep(1000);

        WebElement textBox = driver.findElement(By.xpath("//span[normalize-space()='Text Box']"));
        textBox.click();
        Thread.sleep(1000);

        WebElement nume = driver.findElement(By.xpath("//input[@id='userName']"));
        nume.click();
        nume.sendKeys("Andrei");
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.click();
        email.sendKeys("test@test.com");
        Thread.sleep(1000);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", currentAddress);
        currentAddress.click();
        currentAddress.sendKeys("Adresa curenta");
        Thread.sleep(1000);

        WebElement permanentAdress = driver.findElement(By.id("permanentAddress"));
        permanentAdress.click();
        permanentAdress.sendKeys("Adresa permanenta");
        Thread.sleep(1000);

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
        Thread.sleep(2000);


        driver.quit();

    }


}
