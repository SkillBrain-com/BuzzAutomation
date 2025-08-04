package homework.CiovarnacheConstantinClaudiu.SeleniumTestNG.Selenium1.DemoQA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoQA {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/elements");
        pause(1000);
    }

    @Test
    public void interactWithElements() {

        clickByText("Text Box");

        waitAndSendKeys(By.id("userName"), "Claudiu");
        waitAndSendKeys(By.id("userEmail"), "claudiu@test.com");
        waitAndSendKeys(By.id("currentAddress"), "Adresa curentă");
        waitAndSendKeys(By.id("permanentAddress"), "Adresa permanentă");

        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        scrollAndClick(submitButton);

        clickByText("Check Box");
        scrollAndClick(wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[title='Expand all']"))));
        scrollAndClick(wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='tree-node-home']"))));

        clickByText("Radio Button");
        scrollAndClick(wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='yesRadio']"))));
        scrollAndClick(wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='impressiveRadio']"))));


        clickByText("Web Tables");
        scrollAndClick(wait.until(ExpectedConditions.elementToBeClickable(By.id("addNewRecordButton"))));

        waitAndSendKeys(By.id("firstName"), "Claudiu");
        waitAndSendKeys(By.id("lastName"), "Ciovarnache");
        waitAndSendKeys(By.id("userEmail"), "claudiu@test.com");
        waitAndSendKeys(By.id("age"), "32");
        waitAndSendKeys(By.id("salary"), "7000");
        waitAndSendKeys(By.id("department"), "QA");

        scrollAndClick(wait.until(ExpectedConditions.elementToBeClickable(By.id("submit"))));

        clickByText("Links");
        WebElement homeLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("simpleLink")));
        System.out.println("Text link: " + homeLink.getText());
        homeLink.click();
        pause(1000);

        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
    }

    @AfterClass
    public void tearDown() {
        pause(1500);
        driver.quit();
    }


    private void clickByText(String visibleText) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='" + visibleText + "']")));
        scrollAndClick(element);
    }

    private void waitAndSendKeys(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        scrollIntoView(element);
        pause(300);
        element.clear();
        pause(300);
        element.sendKeys(text);
        pause(400);
    }

    private void scrollAndClick(WebElement element) {
        scrollIntoView(element);
        pause(300);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        pause(400);
    }

    private void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        pause(300);
    }

    private void pause(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
