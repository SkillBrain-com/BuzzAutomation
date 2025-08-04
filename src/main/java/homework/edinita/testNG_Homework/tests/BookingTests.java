package homework.edinita.testNG_Homework.tests;

import org.testng.annotations.Test;
import testNG_Homework.pageObjects.AppointmentPage;
import testNG_Homework.pageObjects.HomePage;

import static org.testng.AssertJUnit.assertTrue;

public class BookingTests extends BaseTest {
    @Test(description = "Verify booking is successful")
    public void testApositiveScenario() {
        HomePage homePage = new HomePage(driver);
        AppointmentPage appointmentPage = new AppointmentPage(driver);
        homePage.getMenuToggleButton().click();
        homePage.getLoginButton().click();
        loginSteps("John Doe", "ThisIsNotAPassword");
        appointmentPage.getDateTextBox().sendKeys("12/12/2025");
        appointmentPage.getBookAppointmentButton().click();
        getWait(driver);
        assertTrue("User is not taken to the Appointment Confirmation page",
                driver.getCurrentUrl().contains("#summary"));
    }
    @Test(description = "Verify booking is not successful")
    public void testAnegativeScenario() {
        HomePage homePage = new HomePage(driver);
        AppointmentPage appointmentPage = new AppointmentPage(driver);
        homePage.getMenuToggleButton().click();
        homePage.getLoginButton().click();
        loginSteps("John Doe", "ThisIsNotAPassword");
        appointmentPage.getBookAppointmentButton().click();
        assertTrue("User is taken to the Appointment Confirmation page",
                driver.getCurrentUrl().contains("#appointment"));
    }
}
