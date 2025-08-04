package homework.GabrielaDumitru.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AppointmentTest extends BaseTest {

    @Test
    public void makeAppointmentPositive() {
        HomePage home = new HomePage(DriverManager.getDriver());
        home.clickMakeAppointment();

        LoginPage login = new LoginPage(DriverManager.getDriver());
        login.login("John Doe", "ThisIsNotAPassword");

        DriverManager.getDriver().findElement(By.id("combo_facility")).click();
        DriverManager.getDriver().findElement(By.id("btn-book-appointment")).click();

        Assert.assertTrue(DriverManager.getDriver().getCurrentUrl().contains("appointment.php#summary"));
    }

    @Test
    public void makeAppointmentNegative() {
        HomePage home = new HomePage(DriverManager.getDriver());
        home.clickMakeAppointment();

        LoginPage login = new LoginPage(DriverManager.getDriver());
        login.login("John Doe", "ThisIsNotAPassword");

        DriverManager.getDriver().findElement(By.id("txt_visit_date")).clear();
        DriverManager.getDriver().findElement(By.id("btn-book-appointment")).click();

        Assert.assertTrue(DriverManager.getDriver().findElements(By.cssSelector(".has-error")).size() > 0);
    }
}
