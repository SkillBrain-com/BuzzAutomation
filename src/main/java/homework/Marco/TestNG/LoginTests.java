package homework.Marco.TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{

    @Test
    public void testLoginWithValidUser() {
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.linkText("Login")).click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("John Doe", "ThisIsNotAPassword");

        Assert.assertTrue(driver.getCurrentUrl().contains("appointment"));
    }

    @Test
    public void testLoginWithInvalidUser() {
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.linkText("Login")).click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalidUser", "invalidPass");

        Assert.assertTrue(loginPage.isLoginErrorVisible());
    }
}
