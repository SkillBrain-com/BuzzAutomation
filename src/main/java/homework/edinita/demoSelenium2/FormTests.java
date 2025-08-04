package homework.edinita.demoSelenium2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FormTests {
    public static void main(String[] args) {
        fillFromDetails();
    }
    public static void fillFromDetails() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

            WebElement username = driver.findElement(By.name("username"));
            WebElement password = driver.findElement(By.name("password"));
            WebElement comment = driver.findElement(By.name("comments"));
            WebElement fileUpload = driver.findElement(By.name("filename"));
            List<WebElement> checkboxes = driver.findElements(By.name("checkboxes[]"));
            List<WebElement> radioButtons = driver.findElements(By.name("radioval"));
            Select select = new Select(driver.findElement(By.name("multipleselect[]")));
            Select dropdown = new Select(driver.findElement(By.name("dropdown")));
            WebElement cancelButton = driver.findElement(By.cssSelector("input[type='reset']"));
            WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

            username.sendKeys("test_demo");
            password.sendKeys("test_demo");
            comment.clear();
            comment.sendKeys("test_demo");
            fileUpload.sendKeys("/Users/nitaedi/Desktop/Desktop/proiecte java/SELENIUM/screenShots/temaSelenium2_alerts.png");
            checkboxes.get(1).click();
            radioButtons.get(2).click();
            select.selectByValue("ms1");
            select.selectByValue("ms2");
            dropdown.selectByIndex(2);

            submitButton.click();
        } catch (Exception | Error e) {
            if(driver != null) {
                File file = driver.getScreenshotAs(OutputType.FILE);
                File destFile = new File("/Users/nitaedi/Desktop/Desktop/proiecte java/SELENIUM/screenShots/temaSelenium2_alerts.png");
                try {
                    FileUtils.copyFile(file, destFile);
                } catch (IOException ex) {
                    System.out.println("Screenshot copy failed.");
                }
            }else {
                System.out.println("Driver instance failed to create successfully.");
            }

        } finally {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(driver != null) {
                driver.quit();
            }
        }
    }
}
