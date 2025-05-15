import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import pages.DemoQaHomePage;

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
