package homework.edinita.testNG_Homework.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import testNG_Homework.driver.WebDriverConfig;
import testNG_Homework.pageObjects.HomePage;

import java.time.Duration;

public class BaseTest {
    protected ChromeDriver driver = null;
    @BeforeMethod()
    public void beforeMethod() {
        driver = WebDriverConfig.getChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
    }
    @BeforeMethod(onlyForGroups = {"with_valid&invalid_login"})
    public void beforeMethodWithValidLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.getMenuToggleButton().click();
        homePage.getLoginButton().click();
    }
    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }
    protected FluentWait<ChromeDriver> getWait(ChromeDriver driver) {
        return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofMillis(500));
    }
    protected void loginSteps(String username, String password) {
        driver.findElement(By.id("txt-username")).sendKeys(username);
        driver.findElement(By.id("txt-password")).sendKeys(password);
        driver.findElement(By.id("btn-login")).click();
    }
}
