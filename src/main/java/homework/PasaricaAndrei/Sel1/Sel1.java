package homework.PasaricaAndrei.Sel1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Sel1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-web-page-test.html");

        List<WebElement> paragraphs = driver.findElements(By.tagName("p"));
        System.out.println("Paragrafe găsite:");
        for (WebElement paragraph : paragraphs) {
            System.out.println(" " + paragraph.getText());
        }

        WebElement buttonByText = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/a"));
        buttonByText.click();
        WebElement buttonByText1 = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/a[1]"));
        buttonByText1.click();
        WebElement buttonByText2 = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/a[2]"));
        buttonByText2.click();

//        WebElement paragraph1 = driver.findElement(By.xpath("/html/body/div/h1"));
//        WebElement paragraph2 = driver.findElement(By.xpath("/html/body/div/div[2]/p"));
//        WebElement paragraph3 = driver.findElement(By.xpath("//*[@id=\"para1\"]"));
//        WebElement paragraph4 = driver.findElement(By.xpath("//*[@id=\"para2\"]"));
//
//        System.out.println("Paragraf 1: " + paragraph1.getText());
//        System.out.println("Paragraf 2: " + paragraph2.getText());
//        System.out.println("Paragraf 3: " + paragraph3.getText());
//        System.out.println("Paragraf 4: " + paragraph4.getText());

        driver.quit();

    }

}

