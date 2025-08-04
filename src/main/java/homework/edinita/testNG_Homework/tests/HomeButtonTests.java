package homework.edinita.testNG_Homework.tests;

import org.testng.annotations.Test;
import testNG_Homework.pageObjects.HomePage;

import static org.testng.AssertJUnit.assertEquals;

public class HomeButtonTests extends BaseTest {
    @Test(description = "Verify if the Home button is redirecting to the home page regardless on what page the user is on")
    public void clickOnHomeButton() {
        HomePage homePage = new HomePage(driver);
        homePage.getMenuToggleButton().click();
        homePage.getLoginButton().click();
        loginSteps("John Doe", "ThisIsNotAPassword");
        homePage.getMenuToggleButton().click();
        homePage.getHomeButton().click();
        assertEquals("User is not taken to the home page",
                "https://katalon-demo-cura.herokuapp.com/", driver.getCurrentUrl());
    }
}
