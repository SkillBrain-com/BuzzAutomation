package homework.Marco.TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppointmentTests  extends BaseTest {

    @Test
    public void testSuccessfulAppointment() {
        // Pasul 1: Login cu un user valid
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.linkText("Login")).click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("John Doe", "ThisIsNotAPassword");

        // Pasul 2: Completează formularul de rezervare
        AppointmentPage appointmentPage = new AppointmentPage(driver);
        appointmentPage.completeAppointmentForm("10/08/2025", "Testare Selenium");

        // Pasul 3: Verifică că am ajuns pe pagina de confirmare
        Assert.assertTrue(driver.getCurrentUrl().contains("appointment.php#summary"));
    }

    @Test
    public void testAppointmentWithMissingDate() {
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.linkText("Login")).click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("John Doe", "ThisIsNotAPassword");

        AppointmentPage appointmentPage = new AppointmentPage(driver);
        appointmentPage.completeAppointmentForm("", "Comentariu fără dată");

        // Verificăm că apare un mesaj de eroare
        Assert.assertTrue(driver.getPageSource().contains("Please fill out this field."));
    }
}
