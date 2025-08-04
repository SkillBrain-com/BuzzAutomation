package homework.edinita.seleniumBasicPartOne_Homework;

import org.openqa.selenium.WebDriver;

public class Run_APP {
    public static void main(String[] args) {
        Setup_Driver driverSetup = new Setup_Driver();
        WebDriver driver = driverSetup.getDriverFromConfigFile();
        DemoQA_HomePage homePage = new DemoQA_HomePage(driver);
        homePage.goToHomePage();
        homePage.clickOnElementCard();

        driver.quit();
    }
}
