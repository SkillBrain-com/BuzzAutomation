package homework.MihaiAlexe.Selenium3TestNG.cura.tests;

import cura.base.TestBaseCura;
import cura.pages.AppointmentPage;
import cura.pages.HomePage;
import cura.pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.*;

public class AppointmentTests extends TestBaseCura {

    public void loginFirst() {
        System.out.println("Începem procesul de login...");
        HomePage home = new HomePage(driver);
        home.openLoginFromMenu();

        LoginPage login = new LoginPage(driver);
        login.login("John Doe", "ThisIsNotAPassword");
        System.out.println("Login efectuat cu succes.");
    }

    @Test
    public void positiveAppointment() {
        System.out.println("Test pozitiv: completare formular cu comentariu valid.");
        loginFirst();

        AppointmentPage appt = new AppointmentPage(driver);
        appt.fillForm("Vreau o programare cât mai curând.");

        System.out.println("Formular completat. Verificăm confirmarea...");
        boolean isConfirmed = appt.isConfirmationDisplayed();
        assertTrue(isConfirmed, "Confirmarea nu a apărut.");
        System.out.println("Confirmarea a apărut. Test reușit.");
    }

    @Test
    public void negativeAppointment_missingDate() {
        System.out.println("Test negativ: completare formular fără dată.");
        loginFirst();

        AppointmentPage appt = new AppointmentPage(driver);
        appt.fillForm("", "Comentariu test", true);

        System.out.println("Formular fără dată trimis. Verificăm dacă apare confirmarea...");
        boolean isConfirmed = appt.isConfirmationDisplayed();
        assertFalse(isConfirmed, "Confirmarea NU trebuia să apară fără dată.");
        System.out.println("Confirmarea nu a apărut (cum era de așteptat). Test negativ reușit.");
    }

    @Test
    public void homeButtonAlwaysReturnsToHomePage() {
        System.out.println("Test: butonul Home duce la homepage.");
        loginFirst();

        HomePage home = new HomePage(driver);
        home.clickHomeButton();

        String expectedUrl = "https://katalon-demo-cura.herokuapp.com/";
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.urlToBe(expectedUrl));

        String actualUrl = driver.getCurrentUrl();
        System.out.println("URL-ul actual după click pe Home: " + actualUrl);
        assertEquals(actualUrl, expectedUrl, "Home button nu a dus la pagina principală!");
    }
}
