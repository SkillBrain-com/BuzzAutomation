package homework.GabrielaDumitru.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        DriverManager.initDriver();
        DriverManager.getDriver().get ("https://katalon-demo-cura.herokuapp.com/");
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
