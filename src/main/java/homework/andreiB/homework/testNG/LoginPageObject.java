package homework.andreiB.homework.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

    private LoginPageObject loginPage;

    private WebDriver driver;

    private By menuCont = By.xpath("//i[@class='fa fa-bars']");
    private By loginLink = By.xpath("//a[normalize-space()='Login']");
    private By usernameField = By.xpath("//input[@id='txt-username']");
    private By passwordField = By.xpath("//input[@id='txt-password']");
    private By loginButton = By.xpath("//button[@id='btn-login']");
    private By errorMessage = By.xpath("//p[@class='lead text-danger']");


    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }


    public void goToLoginPage() {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(menuCont).click();
        driver.findElement(loginLink).click();
    }


    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() throws InterruptedException {
        driver.findElement(loginButton).click();
        Thread.sleep(1000);


    }
    public String getErrorMessage() {
        try {
            Thread.sleep(1000); // sau WebDriverWait dacă vrei mai robust
            WebElement msg = driver.findElement(errorMessage);
            return msg.getText().trim();
        } catch (Exception e) {
            return "The error message was not found";
        }
    }




}
