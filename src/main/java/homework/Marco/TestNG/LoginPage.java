package homework.Marco.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


    WebDriver driver;

    By usernameInput = By.id("txt-username");
    By passwordInput = By.id("txt-password");
    By loginButton = By.id("btn-login");
    By errorMessage = By.cssSelector(".text-danger");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public boolean isLoginErrorVisible() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}
