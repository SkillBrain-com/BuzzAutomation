package homework.Andrei.Paun.Selenium1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributes {
    public static final String Url = "https://testpages.herokuapp.com/styled/index.html";

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Url);
        Thread.sleep(3000);

        WebElement button = driver.findElement(By.id("elementattributestest"));
        button.click();
        Thread.sleep(1000);
        WebElement pharagraph = driver.findElement(By.id("domattributes"));
        pharagraph.click();
        WebElement add = driver.findElement(By.xpath("//button[contains(@class, 'styled-click-button')]"));
        add.click();


    }
}


