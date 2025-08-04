package homework.GabrielaDumitru.testng;


import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest {

    @Test
    public void loginWithValidUser() {
        HomePage home = new HomePage(DriverManager.getDriver());
        home.clickMakeAppointment();

        LoginPage login = new LoginPage(DriverManager.getDriver());
        login.login("John Doe", "ThisIsNotAPassword");

        Assert.assertTrue(DriverManager.getDriver().getCurrentUrl().contains("appointment"));
    }

    @Test
    public void loginWithInvalidUser() {
        HomePage home = new HomePage(DriverManager.getDriver());
        home.clickMakeAppointment();

        LoginPage login = new LoginPage(DriverManager.getDriver());
        login.login("invalid", "wrong");

        Assert.assertTrue(login.isErrorDisplayed());
    }
}
