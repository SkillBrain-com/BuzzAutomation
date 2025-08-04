package homework.Marco.Selenium2;

import SeleniumDemo2.BrowserManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BasicFormHTML {

    public static void main(String[] args) {
        fillFormDetails();
    }

    public static void fillFormDetails() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

            WebElement username = driver.findElement(By.name("username"));
            WebElement password = driver.findElement(By.name("password"));
            WebElement comments = driver.findElement(By.name("comments"));
            WebElement fileUpload = driver.findElement(By.name("filename"));
            WebElement hiddenInput = driver.findElement(By.name("hiddenField"));
            List<WebElement> checkBoxes = driver.findElements(By.name("checkboxes[]"));
            List<WebElement> radioButtons = driver.findElements(By.name("radioval"));
            Select select = new Select(driver.findElement(By.name("multipleselect[]")));
            Select dropDown = new Select(driver.findElement(By.name("dropdown")));
            WebElement cancelButton = driver.findElement(By.cssSelector("input[type=reset]"));
            WebElement submitButton = driver.findElement(By.cssSelector("input[type=submit]"));
            WebElement phoneNumber = driver.findElement(By.id("phoneNumber"));


            username.sendKeys("Minecrafter_TTK");
            password.sendKeys("passwordTest");
            comments.clear();
            comments.sendKeys("Fac si eu un comment pentru acest form");
            fileUpload.sendKeys("C:\\Users\\marco\\OneDrive\\Imagini\\Alex.png");
            hiddenInput.getAttribute("value");
            checkBoxes.get(1).click();
            radioButtons.get(2).click();
            select.deselectAll();
            select.selectByValue("ms1");
            select.selectByValue("ms2");
            dropDown.selectByIndex(2);
            submitButton.click();


        } catch (Exception | Error e) {
            e.printStackTrace();
            if (driver != null) {
                File file = driver.getScreenshotAs(OutputType.FILE);
                File destFile = new File("C:\\Users\\marco\\OneDrive\\Desktop\\Cursuri IT\\temaSelenium2_alerts.png");
                try {
                    FileUtils.copyFile(file, destFile);
                } catch (IOException ex) {
                    System.out.println("Screenshot copy failed");
                }
            } else {
                System.out.println("Driver instance failed sucessfully.");
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
