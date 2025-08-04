package homework.PasaricaAndrei.Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Sel2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/attributes-test.html");

//        List<WebElement> paragraphs = driver.findElements(By.tagName("p"));
//        System.out.println("Paragrafe găsite:");
//        for (WebElement paragraph : paragraphs) {
//            System.out.println(" " + paragraph.getText());
//        }
//
//        WebElement buttonByText = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/a"));
//        buttonByText.click();
//        WebElement buttonByText1 = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/a[1]"));
//        buttonByText1.click();
//        WebElement buttonByText2 = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/a[2]"));
//        buttonByText2.click();

//        WebElement paragraph1 = driver.findElement(By.xpath("/html/body/div/h1"));
//        WebElement paragraph2 = driver.findElement(By.xpath("/html/body/div/div[2]/p/text()"));
//        WebElement paragraph3 = driver.findElement(By.xpath("/html/body/div/h2[1]"));
//        WebElement paragraph4 = driver.findElement(By.xpath("/html/body/div/p[1]"));
//        WebElement paragraph5 = driver.findElement(By.xpath("/html/body/div/div[3]/div"));
//        WebElement paragraph6 = driver.findElement(By.xpath("/html/body/div/h2[2]"));
//        WebElement paragraph7 = driver.findElement(By.xpath("/html/body/div/p[2]/text()"));
//        WebElement paragraph8 = driver.findElement(By.xpath("/html/body/div/div[4]/div"));
//        WebElement button = driver.findElement(By.xpath("/html/body/div/div[4]/button"));
//        WebElement paragraph9 = driver.findElement(By.xpath("/html/body/div/h2[3]"));
//        WebElement paragraph10 = driver.findElement(By.xpath("/html/body/div/p[3]/text()"));
//        WebElement paragraph11 = driver.findElement(By.xpath("/html/body/div/div[5]/div"));
//
//        button.click();
//        System.out.println("Paragraf 1: " + paragraph1.getText());
//        System.out.println("Paragraf 2: " + paragraph2.getText());
//        System.out.println("Paragraf 3: " + paragraph3.getText());
//        System.out.println("Paragraf 4: " + paragraph4.getText());
//        System.out.println("Paragraf 5: " + paragraph5.getText());
//        System.out.println("Paragraf 6: " + paragraph6.getText());
//        System.out.println("Paragraf 7: " + paragraph7.getText());
//        System.out.println("Paragraf 8: " + paragraph8.getText());
//        System.out.println("Paragraf 9: " + paragraph9.getText());
//        System.out.println("Paragraf 10: " + paragraph10.getText());
//        System.out.println("Paragraf 11: " + paragraph11.getText());


        List<WebElement> paragrafe = driver.findElements(By.tagName("p"));

        System.out.println("=== Paragrafe găsite ===");
        for (WebElement p : paragrafe) {
            String text = p.getText();
            String id = p.getAttribute("id");
            String className = p.getAttribute("class");

            System.out.println("Text: " + text);
            if (id != null) System.out.println("id: " + id);
            if (className != null) System.out.println("class: " + className);
        }




        driver.quit();
    }
}
