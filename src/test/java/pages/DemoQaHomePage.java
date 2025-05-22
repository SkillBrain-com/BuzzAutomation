package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.PropertyUtils;

public class DemoQaHomePage extends BasePage {

    private static Logger LOGGER = LoggerFactory.getLogger(DemoQaHomePage.class);

    public DemoQaHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][1]")
    private WebElement elementCard;

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][2]")
    private WebElement formsCard;

    public void goToHomePage() {
        LOGGER.debug("Logging into DemoQa Home Page ....");
        driver.get(PropertyUtils.loadProperties().getProperty("demoQa"));
    }

    public void clickOnFormsCard() {
        formsCard.click();
    }

    public void clickOnElementCard() {
        LOGGER.debug("Clicking on Elements card...");
        elementCard.click();
    }

    public WebElement getElementCard() {
        return elementCard;
    }

    public WebElement getFormsCard() {
        return formsCard;
    }
}
