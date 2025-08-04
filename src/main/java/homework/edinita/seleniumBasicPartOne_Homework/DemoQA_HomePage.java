package homework.edinita.seleniumBasicPartOne_Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoQA_HomePage extends Base_Page{
    private static Logger LOGGER = LoggerFactory.getLogger(DemoQA_HomePage.class);


    public DemoQA_HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][1]")
    private WebElement elementCard;

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][2]")
    private WebElement formsCard;

    public void goToHomePage() {
        LOGGER.debug("Logging into DemoQA Home Page..");
        driver.get(Read_Config_File.readConfigFile().getProperty("url"));
    }

    public void clickOnElementCard() {
        LOGGER.debug("Clicking on Elements card..");
        elementCard.click();
    }
}
