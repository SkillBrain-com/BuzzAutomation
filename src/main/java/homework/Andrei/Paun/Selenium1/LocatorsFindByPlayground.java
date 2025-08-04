package homework.Andrei.Paun.Selenium1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsFindByPlayground {
    public static final String Url = "https://testpages.herokuapp.com/styled/index.html";

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Url);



        WebElement Link = driver.findElement(By.id("findbytest"));
        Link.click();
        System.out.println("Am deschis al 3 link " + Link.getText());



        }


    }

