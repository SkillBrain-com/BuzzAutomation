package homework.GabrielaDumitru.Selenium.java.Tema2Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Chrometest {

    public static void main(String[] args) throws IOException {
        fillFormDetails();
    }

    public static void fillFormDetails() throws IOException {
        ChromeDriver driver = null;

        try {
            driver = BrowserManager.getChromedriver();
            driver.manage().window().maximize();

            driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

            WebElement form = driver.findElement(By.id("HTMLFormElements"));
            WebElement username = driver.findElement(By.name("username"));
            WebElement password = driver.findElement(By.name("password"));
            WebElement comment = driver.findElement(By.name("comments"));
            WebElement fileUpload = driver.findElement(By.name("filename"));
            WebElement hiddenInput = driver.findElement(By.name("hiddenField"));
            List<WebElement> checkboxes = driver.findElements(By.name("checkboxes[]"));
            List<WebElement> radioButtons = driver.findElements(By.name("radioval"));
            Select select = new Select(driver.findElement(By.name("multipleselect")));
            Select dropdown = new Select(driver.findElement(By.name("dropdown")));
            WebElement cancelButton = driver.findElement(By.cssSelector("input[type='reset']"));

            username.sendKeys("test_demo");
            password.sendKeys("passwordTest");
            comment.clear();
            comment.sendKeys("Acesta este commentul meu custom");
            fileUpload.sendKeys("C:\\Users\\User\\Pictures\\Screenshots\\Screenshot temaSelenium2.png");

            System.out.println("Hidden input value: " + hiddenInput.getDomAttribute("value"));

            checkboxes.get(1).click();
            radioButtons.get(2).click();

            if (select.isMultiple()) {
                select.deselectAll();
                select.selectByValue("ms1");
                select.selectByValue("ms2");
            }

            dropdown.selectByIndex(2);

            WebElement submitButton = driver.findElement(By.name("submitbutton"));
            submitButton.click();

            System.out.println("Formular trimis cu succes!");

        } catch (Exception | Error e) {
            e.printStackTrace();
            if (driver != null) {
                File file = driver.getScreenshotAs(OutputType.FILE);
                File destFile = new File("C:\\Users\\User\\Pictures\\Screenshots\\Screenshot_2025-06-16_114453.png");
                try {
                    FileUtils.copyFile(file, destFile);
                } catch (IOException ex) {
                    System.out.println("Screenshot copy failed");
                }
            } else {
                System.out.println("Driver instance failed to create successfully");
            }
        } finally {
            if (driver != null) {
                // driver.quit();
            }
        }
    }
}
