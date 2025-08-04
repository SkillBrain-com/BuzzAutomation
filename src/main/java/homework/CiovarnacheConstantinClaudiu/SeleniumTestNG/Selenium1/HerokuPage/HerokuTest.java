package homework.CiovarnacheConstantinClaudiu.SeleniumTestNG.Selenium1.HerokuPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HerokuTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {

            driver.get("https://testpages.herokuapp.com/styled/index.html");
            System.out.println("=== Opened Main Page ===");


            navigateToLinkByPartialText(driver, wait, "Basic Web Page Example");

            printVisibleTexts(driver);


            driver.navigate().back();


            navigateToLinkByPartialText(driver, wait, "Element Attributes Examples");
            printVisibleTexts(driver);
            driver.navigate().back();


            navigateToLinkByPartialText(driver, wait, "Locators - Find By Playground Test Page");
            printVisibleTexts(driver);
            driver.navigate().back();


            navigateToLinkByPartialText(driver, wait, "WebDriver Example Page");
            printVisibleTexts(driver);
            driver.navigate().back();

        } catch (Exception e) {
            System.out.println("❌ ERROR: " + e.getMessage());
            e.printStackTrace();
        } finally {
            driver.quit();
            System.out.println("=== Test Finished ===");
        }
    }

    private static void navigateToLinkByPartialText(WebDriver driver, WebDriverWait wait, String partialLinkText) {
        System.out.println("=== Navigating to: " + partialLinkText + " ===");
        try {
            WebElement link = wait.until(
                    ExpectedConditions.elementToBeClickable(By.partialLinkText(partialLinkText))
            );
            System.out.println("Link found: " + link.getText());
            link.click();
        } catch (TimeoutException e) {
           System.out.println("❌ Timeout: Link with text [" + partialLinkText + "] not found or not clickable.");
        }
    }


    private static void printVisibleTexts(WebDriver driver) {
        List<WebElement> elements = driver.findElements(By.xpath("//*"));
        System.out.println("Visible elements on the page:");
        for (WebElement el : elements) {
            if (el.isDisplayed() && !el.getText().trim().isEmpty()) {
                System.out.println("Tag: " + el.getTagName() + " -> Text: " + el.getText().trim());
            }
        }
        System.out.println("=====================================");
    }
}
