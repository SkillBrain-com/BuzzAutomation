package homework.PasaricaAndrei.testNg.t2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import testNg.t1.TNG2;

import static org.junit.jupiter.api.Assertions.*;

public class TNG4 extends TNG2 {

    @Test
    public void makeAppointmentRedirectsToLoginIfNotLoggedIn() {
        driver.findElement(By.id("btn-make-appointment")).click();
        assertTrue(driver.getCurrentUrl().contains("profile.php#login"));
    }

    @Test
    public void validAppointmentBooking() {

        driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.id("txt-username")).sendKeys("Ion");
        driver.findElement(By.id("txt-password")).sendKeys("NuParola");
        driver.findElement(By.id("btn-login")).click();


        driver.findElement(By.id("combo_facility")).click();
        driver.findElement(By.cssSelector("input#chk_hospotal_readmission")).click();
        driver.findElement(By.id("txt_visit_date")).sendKeys("30/12/2025");
        driver.findElement(By.id("txt_comment")).sendKeys("Programare,test");
        driver.findElement(By.id("btn-book-appointment")).click();
        assertTrue(driver.getPageSource().contains("Confirmarea Programarii"));
    }

    @Test
    public void invalidAppointmentMissingDate() {

        driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.id("txt-username")).sendKeys("Ion");
        driver.findElement(By.id("txt-password")).sendKeys("NuParola");
        driver.findElement(By.id("btn-login")).click();

        driver.findElement(By.id("btn-book-appointment")).click();

        assertTrue(driver.getPageSource().contains("Visit Date is required"));
    }
}

