package homework.Marco.Selenium1;

import driver.WebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebPage {

    public static void main(String[] args) {
        ChromeDriver driver = WebdriverManager.createChromeDriver();
        webPage(driver);
    }

    public static void webPage(ChromeDriver driver) {
        driver.get("https://testpages.eviltester.com/styled/basic-web-page-test.html");

        WebElement firstText = driver.findElement(By.id("para1"));
        System.out.println(firstText.getText());
        System.out.println("");

        WebElement secondText = driver.findElement(By.id("para2"));
        System.out.println(secondText.getText());

        driver.quit();
    }
}
