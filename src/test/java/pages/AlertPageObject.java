package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class AlertPageObject extends BasePage {

    private static final String ALERT_URL="https://demoqa.com/alerts";
    private static Logger LOGGER = LoggerFactory.getLogger(AlertPageObject.class);

    @FindBy(id = "alertButton")
    private WebElement clickMeButton;

    @FindBy(id = "confirmButton")
    private WebElement confirmButton;

    @FindBy(id = "confirmResult")
    private WebElement confirmMessage;

    @FindBy(id = "promtButton")
    private WebElement promptButton;

    @FindBy(id = "promptResult")
    private WebElement promptResult;



    public void conformOrReject(String yesOrNo) {
        LOGGER.info("User selected " + yesOrNo);
        Alert alert = driver.switchTo().alert();
        if (yesOrNo.equalsIgnoreCase("yes")) {
            alert.accept();
        } else if (yesOrNo.equalsIgnoreCase("no")) {
            alert.dismiss();
        } else {
            Assert.fail("User selected invalid option.");
        }
    }

    public void thirdAlertPrompt(String message, boolean yesOrNo) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(message);
        if (yesOrNo) {
            alert.accept();
        } else {
            alert.dismiss();
        }
    }

    public String getPromptResult() {
        return promptResult.getText();
    }

    public void clickPromptButton() {
        promptButton.click();
    }

    public String getConfirmMessage() {
        return confirmMessage.getText();
    }

    public AlertPageObject(WebDriver driver) {
        super(driver);
    }

    public void clickOnConfirmButton() {
        confirmButton.click();
    }

    public void clickOnClickMe() {
        clickMeButton.click();
    }

    public void goToAlertPage() {
        driver.get(ALERT_URL);
    }

    public String currentUrl() {
        return driver.getCurrentUrl();
    }



}
