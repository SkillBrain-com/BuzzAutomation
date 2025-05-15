package design;


import design.factory.DriverFactory;
import design.pages.DemoQaHomePage;
import org.openqa.selenium.WebDriver;


public class HomePageTest {

    public static void main(String[] args) {
        DriverFactory driverFactory = new DriverFactory();
        WebDriver driver = driverFactory.getDriver();
        DemoQaHomePage homePage = new DemoQaHomePage(driver);
        homePage.goToHomePage();
        homePage.clickOnElementCard();


        homePage.goToHomePage();


        driver.quit();


    }
}
