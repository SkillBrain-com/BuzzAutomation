package homework.Andrei.Paun.Selenium2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlForms {
    private static final String URL = "https://testpages.eviltester.com/styled/basic-html-form-test.html";
    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);


        WebElement nume = driver.findElement(By.xpath("//input[@name='username']"));
        nume.click();
        nume.sendKeys("Andreica");

        WebElement parola = driver.findElement(By.xpath("//input[@name='password']"));
        parola.click();
        parola.sendKeys("dell");

        WebElement commentariu = driver.findElement(By.xpath("//textarea[@name='comments']"));
        commentariu.click();
        commentariu.sendKeys("ciao");
        Thread.sleep(5000);


        WebElement submit = driver.findElement(By.xpath("//input[@value='submit']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        submit.click();


        WebElement findElement = driver.findElement(By.xpath("//li[@id='_valueusername']"));
        System.out.println("Textul afisat e: " + findElement.getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
