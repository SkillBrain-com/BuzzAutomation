package homework.MihaiAlexe.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {
    public static void main(String[] args) {
        ChromeDriver driver = createDriverAndGetPage();
        inputNumbers(driver);
        clickProcess(driver);
        confAfisareNumere(driver);

        // driver.quit();
    }
    public static ChromeDriver createDriverAndGetPage() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/webdriver-example-page");
        return driver;
    }
    public static void inputNumbers(ChromeDriver driver) {
        WebElement box = driver.findElement(By.name("number-entry"));
        box.click();
        box.sendKeys("56849637");
    }
    public static void clickProcess(ChromeDriver driver) {
        WebElement processButton = driver.findElement(By.xpath("//input[@data-locator='process-on-server']"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        processButton.click();
    }
    public static void confAfisareNumere(ChromeDriver driver) {
        WebElement textAfisat = driver.findElement(By.className("message"));
        System.out.println("Confirmare afisare pe ecran numere tastate dupa click: " + textAfisat.getText());
    }
}
