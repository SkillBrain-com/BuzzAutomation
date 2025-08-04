package homework.edinita.demoSelenium2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class AlertTests {
    public static void main(String[] args) {

//        fakeAlertTest();
//        secondAlertTest();
//        firstAlertTest();
    }
    public static boolean isAlertOpened(ChromeDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
    public static void firstAlertTest() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

            WebElement firstButton = driver.findElement(By.id("alertexamples"));
            firstButton.click();
            Alert firstAlert = driver.switchTo().alert();
            System.out.println(firstAlert.getText());
            firstAlert.accept();

            System.out.println("Is alert open after it has been closed: " + isAlertOpened(driver));
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
    public static void secondAlertTest() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

            WebElement secondButton = driver.findElement(By.id("confirmexample"));

            for (int i = 0; i < 1; i++) {
                System.out.println("Iteration " + i);
                secondButton.click();
                System.out.println("Is alert open after click on button: " + isAlertOpened(driver));
                Alert alert = driver.switchTo().alert();
                if (i == 0) {
                    alert.accept();
                }else {
                    alert.dismiss();
                }
                System.out.println(driver.findElement(By.id("confirmexplanation")).getText());
                System.out.println("Is alert open after it has been close: " + isAlertOpened(driver));
                System.out.println("--------------------------------------");
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
    public static void fakeAlertTest() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");

            WebElement modalButton = driver.findElement(By.cssSelector("#modaldialog"));
            WebElement dialog = driver.findElement(By.cssSelector("div.dialog"));
            System.out.println(dialog.getAttribute("class"));
            modalButton.click();
            System.out.println(dialog.getAttribute("class"));
            WebElement modalOk = driver.findElement(By.id("dialog-ok"));
            modalOk.click();
            System.out.println(dialog.getAttribute("class"));
        } catch (Exception | Error e) {
            if (driver != null) {
                File file = driver.getScreenshotAs(OutputType.FILE);
                File destFile = new File("/Users/nitaedi/Desktop/Desktop/proiecte java/SELENIUM/screenShots/temaSelenium2.png");
                try {
                    FileUtils.copyFile(file, destFile);
                } catch (IOException ex) {
                    System.out.println("Screenshot copy failed.");
                }
            } else {
                System.out.println("Driver instance failed to create successfully.");
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
