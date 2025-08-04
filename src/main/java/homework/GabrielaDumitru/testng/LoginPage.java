package homework.GabrielaDumitru.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameInput = By.id("txt-username");
    private By passwordInput = By.id("txt-password");
    private By loginBtn = By.id("btn-login");
    private By errorMsg = By.cssSelector(".text-danger");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginBtn).click();
    }

    public boolean isErrorDisplayed() {
        return driver.findElements(errorMsg).size() > 0;
    }
}
