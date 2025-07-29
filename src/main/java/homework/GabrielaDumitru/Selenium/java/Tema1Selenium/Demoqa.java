package homework.GabrielaDumitru.Selenium.java.Tema1Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {
    public static void main(String[] args) {
        ChromeDriver driver = createDriverAndGetPage();
        textBox(driver);

    }

    public static ChromeDriver createDriverAndGetPage() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        return driver;
    }

    public static void textBox (ChromeDriver driver){
        WebElement elementsDropList = driver.findElement(By.className("header-right"));
        elementsDropList.click();
        WebElement clickTextBox = driver.findElement(By.xpath("//span[text()='Text Box']"));
        clickTextBox.click();
        WebElement enterName = driver.findElement(By.xpath("//input[@id='userName']"));
        enterName.click();
        enterName.sendKeys("Demoqa Automatizare");
        WebElement enterEmail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        enterEmail.click();
        enterEmail.sendKeys("nume@test.com");
        WebElement enterAddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        enterAddress.click();
        enterAddress.sendKeys("Bld. I.C.Bratianu, nr. 1, Constanta");
        WebElement permAddress = driver.findElement(By.cssSelector("textarea#permanentAddress.form-control"));
        permAddress.click();
        permAddress.sendKeys("Bld. I.C.Bratianu, nr. 1, Constanta");

    }
}