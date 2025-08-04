package homework.PasaricaAndrei.Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Sel4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/webdriver-example-page?number-entry=4");

        List<WebElement> paragraphs = driver.findElements(By.tagName("p"));
        List<WebElement> lists = driver.findElements(By.tagName("li"));
        List<WebElement> labels = driver.findElements(By.tagName("label"));
        System.out.println("Paragrafe găsite:");
        for (WebElement paragraph : paragraphs) {
            System.out.println(" " + paragraph.getText());
        }
        for(WebElement list : lists) {
            System.out.println(" " + list.getText());
        }
        for(WebElement label : labels) {
            System.out.println(" " + label.getText());
        }

        WebElement field = driver.findElement(By.id("numentry"));
        field.click();
        String keys = "25";
        field.sendKeys(keys);
        Thread.sleep(1000);
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit-to-server\"]"));
        submit.click();
        Thread.sleep(1000);
        WebElement alert = driver.findElement(By.xpath("//*[@id=\"show-as-alert\"]"));
        alert.click();
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        WebElement para = driver.findElement(By.xpath("//*[@id=\"show-as-para\"]"));
        para.click();
        Thread.sleep(1000);
        WebElement buttonByText3 = driver.findElement(By.xpath("//*[@id=\"clickable-link\"]"));
        buttonByText3.click();
        Thread.sleep(1000);

//        WebElement input = driver.findElement(By.id("numetry"));
//        input.clear();
//
//        String inputs = "23";
//        input.sendKeys(inputs);
//
//        WebElement submit = driver.findElement(By.id("submit-to-server"));
//        submit.click();


        WebElement buttonByText = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/a"));
        buttonByText.click();
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        WebElement buttonByText1 = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/a[1]"));
        buttonByText1.click();
        Thread.sleep(1000);
        WebElement buttonByText2 = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/a[2]"));
        buttonByText2.click();
        Thread.sleep(1000);



        driver.quit();
    }
}
