package homework.Marco.Selenium1;

import driver.WebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PageHeadingOne {

    public static void main(String[] args) {
        ChromeDriver driver = WebdriverManager.createChromeDriver();
        testPageHeading(driver);

    }

    public static void testPageHeading(ChromeDriver driver) {
        pageHeadingOne(driver);
    }


    public static void pageHeadingOne(ChromeDriver driver) {
        driver.get("https://testpages.eviltester.com/styled/webdriver-example-page");

        WebElement firstParagraph = driver.findElement(By.id("para1"));
        System.out.println(firstParagraph.getText());

        WebElement secondParagraph = driver.findElement(By.id("para2"));
        System.out.println(secondParagraph.getText());

        List<WebElement> listElements = driver.findElements(By.cssSelector("ul#main-example-list "));
        for (int i = 0; i < listElements.size(); i++) {
            WebElement currentItems = listElements.get(i);
            if (i==0) {
                List<WebElement> firstItems = currentItems.findElements(By.cssSelector("li"));
                System.out.println(firstItems.get(0).getText());
                System.out.println(firstItems.get(1).getText());
                System.out.println(firstItems.get(2).getText());
                System.out.println("");

                //Titlul tabelului
                WebElement tableTitle = driver.findElement(By.cssSelector("label "));
                System.out.println(tableTitle.getText());

                //Tabelul pentru inserarea numerelor
                WebElement numberTableBox = driver.findElement(By.id("numentry"));
                numberTableBox.click();
                numberTableBox.sendKeys("4");


                //Butonul Process On Server
                WebElement processOnServerButton = driver.findElement(By.cssSelector("input#submit-to-server"));
                processOnServerButton.click();

                //Textul numarului inserat
                WebElement insertedNumber = driver.findElement(By.id("message"));
                System.out.println(insertedNumber.getText());

                WebElement numberText = currentItems.findElement(By.id("message"));
                System.out.println("Numarul scris in text este: " + numberText);
            }


        }
        driver.quit();
    }

}
