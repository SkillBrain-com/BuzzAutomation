package homework.edinita.testNG_Homework.tests;

import org.testng.annotations.Test;
import testNG_Homework.pageObjects.HomePage;

import static org.testng.AssertJUnit.assertTrue;

public class AppointmentTests  extends BaseTest {
    @Test(description = "Verify if not logged in user click on Make Appointment button is taken to the login page")
    public void clickOnMakeAppointmentButton() {
        HomePage homePage = new HomePage(driver);
        homePage.getMakeAppointmentButton().click();
        assertTrue("User is not taken to the login page",
                driver.getCurrentUrl().contains("#login"));
    }
}
