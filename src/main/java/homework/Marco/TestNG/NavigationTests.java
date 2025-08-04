package homework.Marco.TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTest{

    @Test
    public void testMakeAppointmentRedirectToLogin() {
        driver.findElement(By.id("btn-make-appointment")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("profile.php#login"));
    }

    @Test
    public void testHomeButtonRedirectsToHomePage() {
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.linkText("Login")).click();

        driver.findElement(By.linkText("Home")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://katalon-demo-cura.herokuapp.com/"));
    }
}
