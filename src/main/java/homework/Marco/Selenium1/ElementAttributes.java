package homework.Marco.Selenium1;

import driver.WebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributes {

    public static void main(String[] args) {
        ChromeDriver driver = WebdriverManager.createChromeDriver();
        elementAttributes(driver);
    }

    public static void elementAttributes(ChromeDriver driver) {
        driver.get("https://testpages.eviltester.com/styled/attributes-test.html");

        WebElement firstAttributeText = driver.findElement(By.cssSelector(".centered #domattributes"));
        System.out.println(firstAttributeText.getText());

        WebElement secondAttributeText = driver.findElement(By.id("jsattributes"));
        System.out.println(secondAttributeText.getText());

        WebElement addAttributeButton = driver.findElement(By.cssSelector(".styled-click-button "));
        addAttributeButton.click();
        System.out.println("The new attribute is: " + secondAttributeText.getAttribute("nextId"));

        WebElement thirdAttributeButton = driver.findElement(By.cssSelector(".coloured-para-red #jsautoattributes"));
        System.out.println(thirdAttributeButton.getText());
        System.out.println(thirdAttributeButton.getAttribute("name"));


        driver.quit();
    }
}
