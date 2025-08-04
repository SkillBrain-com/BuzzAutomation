package homework.Marco.Selenium2;

import SeleniumDemo2.BrowserManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class Alerts {

    public static void main(String[] args) throws IOException {
        //ThirdButton();  are nonExistentSelector
        //FakeAlertBox(); are nonExistentSelector
        //ModalDialogBox(); are nonExistentSelector
//        ExceptionsAlert(); asta e de la ThirdButton
    }

    public static void ThirdButton() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");

            WebElement thirdButton = driver.findElement(By.id("promptexample"));
            for (int i = 0; i <= 1; i++) {
                System.out.println("Iteration " + i);
                thirdButton.click();
                System.out.println("Is alert open after click on button: " + isAlertOpen(driver));
                Alert alert = driver.switchTo().alert();
                if (i == 0) {
                    alert.sendKeys("Am schimbat alerta");
                    alert.accept();
                } else {
                    alert.dismiss();
                }

                System.out.println(driver.findElement(By.id("promptreturn")).getText());
                System.out.println(driver.findElement(By.id("promptexplanation")).getText());
                System.out.println("Is alert open after it has been closed: " + isAlertOpen(driver));
                System.out.println("------------");
            }

        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static void FakeAlertBox() throws IOException {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://testpages.eviltester.com/styled/alerts/fake-alert-test.html");

            WebElement fakeAlert = driver.findElement(By.id("fakealert"));
            WebElement dialogText = driver.findElement(By.cssSelector("#dialog-text"));
            WebElement dialogOk = driver.findElement(By.cssSelector("#dialog-ok"));
//            WebElement nonExistentAlert = driver.findElement(By.id("nonExistentAlert"));

//            nonExistentAlert.click();
            fakeAlert.click();
            System.out.println(dialogText.getText());
            dialogOk.click();
            System.out.println("Am apasat butonul de ok de la fake alert");

        }catch (Exception | Error e) {
            if (driver != null) {
                File file = driver.getScreenshotAs(OutputType.FILE);
                File destFile = new File("C:\\Users\\marco\\OneDrive\\Desktop\\Cursuri IT\\NoFakeAlert.png");
                FileUtils.copyFile(file,destFile);
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static void ModalDialogBox() throws IOException {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://testpages.eviltester.com/styled/alerts/fake-alert-test.html");

            WebElement modalDialog = driver.findElement(By.id("modaldialog"));
            WebElement dialogText = driver.findElement(By.id("dialog-text"));
            WebElement dialogOkButton = driver.findElement(By.id("dialog-ok"));
//            WebElement invisibleButton = driver.findElement(By.id("invisibleBtn"));
//            invisibleButton.click();

            modalDialog.click();
            System.out.println(dialogText.getText());
            dialogOkButton.click();
            System.out.println("Am apasat ok la butonul de modal dialog");
        } catch (Exception | Error e) {
            if (driver != null) {
                File file = driver.getScreenshotAs(OutputType.FILE);
                File destFile = new File("C:\\Users\\marco\\OneDrive\\Desktop\\Cursuri IT\\FakeDialog.png");
                FileUtils.copyFile(file,destFile);
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static void ExceptionsAlert() throws IOException {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");

//            WebElement ImaginatedButton = driver.findElement(By.id("imaginatedButton"));
//            ImaginatedButton.click();

        }catch (Exception | Error e) {
            if (driver != null) {
                File file = driver.getScreenshotAs(OutputType.FILE);
                File destFile = new File("C:\\Users\\marco\\OneDrive\\Desktop\\Cursuri IT\\ImaginatedButton.png");
                FileUtils.copyFile(file,destFile);
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static boolean isAlertOpen(ChromeDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
    }

