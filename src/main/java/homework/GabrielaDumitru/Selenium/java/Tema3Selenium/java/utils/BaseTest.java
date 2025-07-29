package homework.GabrielaDumitru.Selenium.java.Tema3Selenium.java.utils;

import drivers.DriverManager;
import homework.GabrielaDumitru.Selenium.java.Tema4Selenium.java.com.skillbrain.ticket_types_new.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    private homework.GabrielaDumitru.Selenium.java.Tema4Selenium.java.com.skillbrain.ticket_types_new.DriverManager.DriverManager DriverManager;

    @BeforeMethod
    public void setUp() {
        driver = DriverManager.initDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
