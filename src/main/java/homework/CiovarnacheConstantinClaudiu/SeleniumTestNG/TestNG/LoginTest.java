package homework.CiovarnacheConstantinClaudiu.SeleniumTestNG.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void loginValidUser() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement makeAppointmentBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("btn-make-appointment")));
        makeAppointmentBtn.click();


        WebElement usernameInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("txt-username")));
        usernameInput.sendKeys("John Doe");

        WebElement passwordInput = driver.findElement(By.id("txt-password"));
        passwordInput.sendKeys("ThisIsNotAPassword");

        WebElement loginBtn = driver.findElement(By.id("btn-login"));
        loginBtn.click();


        WebElement appointmentHeader = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Make Appointment')]"))
        );

        Assert.assertTrue(appointmentHeader.isDisplayed(), "Login valid a eșuat - nu s-a ajuns pe pagina Make Appointment.");
    }

    @Test
    public void loginInvalidUser() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement makeAppointmentBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("btn-make-appointment")));
        makeAppointmentBtn.click();

        WebElement usernameInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("txt-username")));
        usernameInput.sendKeys("invalidUser");

        WebElement passwordInput = driver.findElement(By.id("txt-password"));
        passwordInput.sendKeys("wrongPassword");

        WebElement loginBtn = driver.findElement(By.id("btn-login"));
        loginBtn.click();


        WebElement errorMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".lead.text-danger"))
        );

        String actualErrorText = errorMsg.getText();
        System.out.println("Mesaj eroare login: " + actualErrorText);

        Assert.assertTrue(actualErrorText.contains("Login failed! Please ensure the username and password are valid."),
                "Mesajul de eroare nu corespunde");
    }
}
