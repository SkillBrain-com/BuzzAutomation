package homework.Andrei.Paun.Selenium1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebPage {
    public static final String Url= "https://testpages.herokuapp.com/styled/index.html";

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Url);
        Thread.sleep(1000);


        WebElement WebPage = driver.findElement(By.id("basicpagetest"));
        WebPage.click();
        Thread.sleep(1000);
        WebElement Paragraph1 = driver.findElement(By.id("para1"));
        Paragraph1.getText();
        System.out.println("Paragraful este: " + Paragraph1.getText());
        WebElement Paragraph2 = driver.findElement(By.id("para2"));
        String text = Paragraph2.getText();
        System.out.println("Paragraful 2 este:" + text);
        driver.findElement(By.xpath("//div[@class=\"page-navigation\"]")).click();

        driver.quit();
    }


}
