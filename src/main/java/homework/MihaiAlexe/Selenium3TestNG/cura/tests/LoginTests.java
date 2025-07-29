package homework.MihaiAlexe.Selenium3TestNG.cura.tests;

import cura.base.TestBaseCura;
import cura.pages.HomePage;
import cura.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends TestBaseCura {

    @Test
    public void loginWithValidCredentials() {
        System.out.println("Test pozitiv: login cu credențiale valide.");

        HomePage home = new HomePage(driver);
        home.openLoginFromMenu();

        System.out.println("Introducem user valid și parolă corectă...");
        LoginPage login = new LoginPage(driver);
        login.login("John Doe", "ThisIsNotAPassword");

        System.out.println("Verificăm dacă a apărut pagina cu titlul 'Make Appointment'...");

        String pageSource = driver.getPageSource();
        assertTrue(pageSource.contains("Make Appointment"),
                " Loginul nu a dus la afișarea paginii Make Appointment!");

        System.out.println(" Login reușit. Textul 'Make Appointment' a fost găsit.");
    }


    @Test
    public void loginWithInvalidCredentials() {
        System.out.println("Test negativ: login cu credențiale invalide.");
        HomePage home = new HomePage(driver);
        home.openLoginFromMenu();

        System.out.println("Introducem user invalid și parolă greșită...");
        LoginPage login = new LoginPage(driver);
        login.login("InvalidUser", "WrongPassword");


        String errorMessage = driver.findElement(By.cssSelector("p.lead.text-danger")).getText();
        System.out.println("Mesaj de eroare afișat: " + errorMessage);


        String expectedError = "Login failed! Please ensure the username and password are valid.";
        assertTrue(errorMessage.contains(expectedError),
                "Mesajul de eroare nu a fost afișat corespunzător!");

        System.out.println("Testul a confirmat afișarea mesajului de eroare la login invalid.");
    }


}
