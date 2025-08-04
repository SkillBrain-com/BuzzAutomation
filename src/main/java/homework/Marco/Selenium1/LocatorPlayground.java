package homework.Marco.Selenium1;

import driver.WebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPlayground {

    public static void main(String[] args) {
        ChromeDriver driver = WebdriverManager.createChromeDriver();
        //allTextMethod(driver);
        //nestedTextMethod(driver);
        //linkDivMethod(driver);
        //finalTextMethod(driver);
    }

    public static void allTextMethod(ChromeDriver driver) {
        driver.get("https://testpages.eviltester.com/styled/find-by-playground-test.html");

        WebElement allText = driver.findElement(By.cssSelector(".specialDiv"));
        System.out.println(allText.getText());
    }

    public static void nestedTextMethod(ChromeDriver driver) {
        driver.get("https://testpages.eviltester.com/styled/find-by-playground-test.html");

        WebElement nestedText = driver.findElement(By.id("div2"));
        System.out.println(nestedText.getText());
    }

    public static void linkDivMethod(ChromeDriver driver) {
        driver.get("https://testpages.eviltester.com/styled/find-by-playground-test.html");

        WebElement linkText = driver.findElement(By.id("ul1"));
        System.out.println(linkText.getText());
    }

    public static void finalTextMethod(ChromeDriver driver) {
        driver.get("https://testpages.eviltester.com/styled/find-by-playground-test.html");

        WebElement finalText = driver.findElement(By.id("pre1"));
        System.out.println(finalText.getText());
    }
}
