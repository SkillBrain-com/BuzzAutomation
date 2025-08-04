package homework.PaulaVasiliu.Selenium2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class BrowserWindowsTest {


    private static final String URL = "https://demoqa.com/browser-windows";
    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        WebElement initialTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
        initialTab.click();
        Thread.sleep(1500);

        String initialTabHandle = driver.getWindowHandle();
        Set<String> allTabs = driver.getWindowHandles();
        for (String tabHandle : allTabs) {
            if (!tabHandle.equals(initialTabHandle)) {
                driver.switchTo().window(tabHandle);
                break;
            }
        }
        WebElement secoundTab = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        System.out.println("Textul afișat este: " + secoundTab.getText());

        driver.quit();
    }


}
