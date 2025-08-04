package homework.Marco.Selenium2;

import SeleniumDemo2.BrowserManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ElementFormHTML {

    public static void main(String[] args) throws IOException {
        ElementForm();
    }

    public static void ElementForm() throws IOException {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://testpages.eviltester.com/styled/html5-form-test.html");

            WebElement date = driver.findElement(By.name("date"));
            WebElement localDateTime = driver.findElement(By.name("datetime"));
            WebElement email = driver.findElement(By.name("email"));
            WebElement month = driver.findElement(By.name("month"));
            WebElement number = driver.findElement(By.name("number"));
            WebElement resetButton = driver.findElement(By.cssSelector("input[type=reset]"));
            WebElement submitButton = driver.findElement(By.cssSelector("input[type=submit]"));
 //           WebElement firstName = driver.findElement(By.name("name"));

            resetButton.click();
            date.sendKeys("10142009");
            localDateTime.click();
            localDateTime.sendKeys("01080020251900");
            email.clear();
            email.sendKeys("test@test.com");
            month.sendKeys("2");
            month.click();
            month.sendKeys("2025");
            number.sendKeys("07555334235");
            submitButton.click();



        }catch (Exception | Error e) {
            if (driver != null) {
                File file = driver.getScreenshotAs(OutputType.FILE);
                File destFile = new File("C:\\Users\\marco\\OneDrive\\Desktop\\Cursuri IT\\FakeElement.png");
                FileUtils.copyFile(file,destFile);
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
