package homework.GabrielaDumitru.testng;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTest {

    @Test
    public void homeButtonAlwaysRedirectsToHomepage() {
        DriverManager.getDriver().findElement(By.id("btn-make-appointment")).click();
        DriverManager.getDriver().findElement(By.id("menu-toggle")).click();
        DriverManager.getDriver().findElement(By.linkText("Home")).click();

        Assert.assertTrue(DriverManager.getDriver().getCurrentUrl().equals("https://katalon-demo-cura.herokuapp.com/"));
    }
}
