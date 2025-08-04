package homework.Marco.Selenium2;

import SeleniumDemo2.BrowserManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class WindowsLinks {

    public static void main(String[] args) throws IOException {
        WindowsLinks();
    }

    public static void WindowsLinks() throws IOException {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromeDriver();
            driver.get("https://testpages.eviltester.com/styled/windows-test.html");

            WebElement firstLink = driver.findElement(By.id("gobasicajax"));
            WebElement secondLink = driver.findElement(By.id("goattributes"));
            WebElement thirdLink = driver.findElement(By.id("goalerts"));
            WebElement fourthLink = driver.findElement(By.id("fakeLink"));


//            firstLink.click();
//            secondLink.click();
//            thirdLink.click();

            String parentWindow = driver.getWindowHandle();
            Set<String> windowHandles = driver.getWindowHandles();

            for (String window: windowHandles) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }

//            System.out.println(driver.findElement(By.cssSelector(".centered")).getText());     //---->firstLink
//            System.out.println(driver.findElement(By.id("domattributes")).getText());          //---->secondLink

            WebElement alertBox = driver.findElement(By.id("alertexamples"));                //
            alertBox.click();                                                                //
            Alert alert = driver.switchTo().alert();                                         //----->thirdLink
            alert.accept();                                                                  //
            System.out.println(driver.findElement(By.id("alertexplanation")).getText());     //

            driver.close();
        } catch (Exception | Error e) {
            if (driver != null) {
                File file = driver.getScreenshotAs(OutputType.FILE);
                File destFile = new File("C:\\Users\\marco\\OneDrive\\Desktop\\Cursuri IT\\FakeLink.png");
                FileUtils.copyFile(file,destFile);
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
