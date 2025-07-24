package homework.Emanuel.Homework_SeleniumBascis3;

import design.factory.DriverFactory;
import homework.Emanuel.Homework_SeleniumBascis3.Page.Basic_Ajax_Example_Page;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic_Ajax_Example {

    private WebDriver driver;
    private DriverFactory factori;
    private Basic_Ajax_Example_Page page;
    private static Logger LOGER = LoggerFactory.getLogger(Basic_Ajax_Example.class);

    @BeforeTest
    public void incepereaTestului(){
        LOGER.info("Executarea metodei inainte de testare");
        factori = new DriverFactory();
        driver = factori.getDriver();
        page = new Basic_Ajax_Example_Page(driver);
        LOGER.info("Testul de initializare a fost finalizat");
    }
    @Test
    public void goToPage(){
        page.goPage();
        LOGER.info("Se va executa verificarea");
        String url = page.Actual_URL();
        String expectedURL = "https://testpages.herokuapp.com/styled/basic-ajax-test.html";
        Assert.assertEquals(url, expectedURL);
        LOGER.info("Se termina verificarea");
        page.clickOnClick();
    }
    @AfterTest
    public void terminareaTestului(){
       driver.quit();
    }
}
