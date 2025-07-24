package homework.andreiB.homework.testNG;

import design.factory.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

    private DriverFactory driverFactory;
    private WebDriver driver;
    private LoginPageObject loginPageObject;
    private MakeAppointmentPage makeAppointmentPage;


    @BeforeTest
    public void setup() {
        driverFactory = new DriverFactory();
        driver = driverFactory.getDriver();
        loginPageObject = new LoginPageObject(driver);
        makeAppointmentPage = new MakeAppointmentPage(driver);
    }

  @Test
    public void positiveLoginTest() throws InterruptedException {
        loginPageObject.goToLoginPage();
        loginPageObject.enterUsername("John Doe");
        loginPageObject.enterPassword("ThisIsNotAPassword");
        loginPageObject.clickLogin();

    }

    @Test
    public void negativeLoginTest() throws InterruptedException {
        loginPageObject.goToLoginPage();
        loginPageObject.enterUsername("Admin");
        loginPageObject.enterPassword("Admin");
        loginPageObject.clickLogin();
        String error = loginPageObject.getErrorMessage();
        System.out.println("Mesajul de eroare este: " + error);

        Assert.assertTrue(error.contains("invalid"));
    }

    @Test
    public void testAppointmentValid() throws InterruptedException {
        loginPageObject.goToLoginPage();
        loginPageObject.enterUsername("John Doe");
        loginPageObject.enterPassword("ThisIsNotAPassword");
        loginPageObject.clickLogin();
        makeAppointmentPage.selectFacility("Seoul CURA Healthcare Center");
        makeAppointmentPage.checkHospitalReadmission();
        makeAppointmentPage.chooseHealthcareProgram();
        makeAppointmentPage.setVisitDate("25/07/2025");
        makeAppointmentPage.enterComment("Test programare validă");
        makeAppointmentPage.clickBook();
    }


    @Test
    public void testAppointmentInvalid() throws InterruptedException {
        loginPageObject.goToLoginPage();
        loginPageObject.enterUsername("John Doe");
        loginPageObject.enterPassword("ThisIsNotAPassword");
        loginPageObject.clickLogin();
        makeAppointmentPage.checkHospitalReadmission();
        makeAppointmentPage.chooseHealthcareProgram();
        makeAppointmentPage.enterComment("Fără dată vizită");
        makeAppointmentPage.clickBook();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("appointment"), "Ar fi trebuit să rămânem pe pagina de programare!");

    }


    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
