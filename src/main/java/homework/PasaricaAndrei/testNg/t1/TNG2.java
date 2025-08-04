package homework.PasaricaAndrei.testNg.t1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TNG2 {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = TNG1.getDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
    }

    @AfterEach
    public void tearDown() {
        TNG1.quitDriver();
    }

    //Pt ex2
//    @BeforeEach
//    public void setUp() {
//        driver = TNG1.getDriver();
//        driver.get("https://katalon-demo-cura.herokuapp.com/");
//    }
//
//    @AfterEach
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
