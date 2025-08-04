package homework.edinita.testNG_Homework.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testNG_Homework.pageObjects.HomePage;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTests extends BaseTest {
    @Test(description = "Verify login scenario with demo user and invalid user", dataProvider = "loginUsers", groups = {"with_valid&invalid_login"})
    public void testLoginScenarioWithValidLogin(String username, String password, boolean shouldLogin) {
        loginSteps(username, password);
        if(shouldLogin) {
            assertTrue("User didn't got to the appointment page after login",
                    driver.getCurrentUrl().contains("#appointment"));
        } else {
            HomePage homePage = new HomePage(driver);
            assertTrue("User did not get an error message",
                    homePage.getErrorMessage().isDisplayed());
        }
    }
    @DataProvider
    public Object[][] loginUsers(){
        return new Object[][]{
                {"John Doe", "ThisIsNotAPassword", true},
                {"John Doe", "zizi", false}
        };
    }
}
