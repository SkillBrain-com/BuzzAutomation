package homework.PaulaVasiliu.Selenium2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlFormsPageTest {

    private static final String URL = "https://testpages.eviltester.com/styled/basic-html-form-test.html";
    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        WebElement nume = driver.findElement(By.xpath("//input[@name='username']"));
        nume.click();
        nume.sendKeys("Paula");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.click();
        password.sendKeys("Test123456");

        WebElement comment = driver.findElement(By.xpath("//textarea[@name='comments']"));
        comment.click();
        comment.sendKeys("Buna");


        WebElement submit = driver.findElement(By.xpath("//input[@value='submit']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        submit.click();
        Thread.sleep(2500);

        WebElement findElement = driver.findElement(By.xpath("//li[@id='_valueusername']"));
        System.out.println("Textul afișat este: " + findElement.getText());

        driver.quit();


    }
}