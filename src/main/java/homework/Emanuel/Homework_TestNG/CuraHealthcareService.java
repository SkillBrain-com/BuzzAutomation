package homework.Emanuel.Homework_TestNG;

import design.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CuraHealthcareService {

    private WebDriver driver;
    private DriverFactory driverFactory;
    private homework.Emanuel.Homework_TestNG.Page.CuraHealthcareServicePage pageCura;
    private static Logger LOGER = LoggerFactory.getLogger(CuraHealthcareService.class);

    @BeforeTest
    public void initTest(){
        LOGER.info("Executarea metodei inainte de testare...!");
//        pageCura.Page();
        driverFactory = new DriverFactory();
        driver = driverFactory.getDriver();
        pageCura = new homework.Emanuel.Homework_TestNG.Page.CuraHealthcareServicePage(driver);
        LOGER.info("Testul de initializare a fost finalizat.");
    }
    @Test//Valid
    public void loginUserValid(){
        pageCura.Page();
        pageCura.clickonClick();
        pageCura.goToLogin();
        pageCura.goToEmail();
        pageCura.goToParola();
        pageCura.goToConfirm();
        pageCura.OK();
    }
    @Test//Invalid
    public void loginUserInvalid(){
        pageCura.Page();
        pageCura.clickonClick();
        pageCura.goToLogin();
        pageCura.goToEmailInvalid();
        pageCura.goToParola();
        pageCura.goToConfirm();
        LOGER.info("Mesajul afisat este o eroare: " +  pageCura.getText());
    }
    @AfterTest
    public void finalizeTest(){
        LOGER.info("Test incheiat, inchidere driver!");
        ScreenShotService.takeScreenShot(driver);
        driver.quit();
    }
}
