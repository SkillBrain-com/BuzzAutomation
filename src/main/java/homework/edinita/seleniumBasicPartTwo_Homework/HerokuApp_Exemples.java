package homework.edinita.seleniumBasicPartTwo_Homework;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class HerokuApp_Exemples extends Base_Page {
    private static final String ALERTS_FIRST_EXEMPLE_URL="https://testpages.eviltester.com/styled/alerts/alert-test.html";
    private static final String ALERTS_SECOND_EXEMPLE_URL="https://testpages.eviltester.com/styled/alerts/fake-alert-test.html";
    private static final String FORMS_WINDOWS_FIRST_EXEMPLE_URL="https://testpages.eviltester.com/styled/html5-form-test.html";
    private static final String FORMS_WINDOWS_SECOND_EXEMPLE_URL="https://testpages.eviltester.com/styled/windows-test.html";
    private String parentWindow;
    private static Logger LOGGER = LoggerFactory.getLogger(HerokuApp_Exemples.class);

    public HerokuApp_Exemples(WebDriver driver) {super(driver);}

    @FindBy(id ="promptexample")
    private WebElement promptBoxAlert;
    @FindBy(id ="promptexplanation")
    private WebElement promptBoxAlertReturnConfirmation;
    @FindBy(id ="promptretval")
    private WebElement promptBoxAlertReturnText;
    @FindBy(id = "modaldialog")
    private WebElement fakeAlertButton;
    @FindBy(id = "dialog-ok")
    private WebElement fakeAlertOkButton;
    @FindBy(id ="dialog-text")
    private WebElement fakeAlertText;
    @FindBy(xpath = "//div[@class=\"faded-background active\"]")
    private WebElement fakeAlertBackground;
    @FindBy(id = "colour-picker")
    private WebElement colourPickerButton;
    @FindBy(id = "date-picker")
    private WebElement datePickerTextBox;
    @FindBy(id = "month-field")
    private WebElement monthField;
    @FindBy(id = "date-time-picker")
    private WebElement dateTimePickerTextBox;
    @FindBy(id = "gobasicajax")
    private WebElement firstJumpLink;

    public void goToPromptBoxAlert() {
        driver.get(ALERTS_FIRST_EXEMPLE_URL);
    }
    public void sendKeysOnPromptBoxAlert(String message) {
        driver.switchTo().alert().sendKeys(message);
    }
    public void acceptAndDismissAlert() {
        for (int i = 0; i <= 1; i++) {
            promptBoxAlert.click();
            Alert alert = driver.switchTo().alert();
            if (i == 0) {
                sendKeysOnPromptBoxAlert(RandomStringUtils.randomAlphabetic(10));
                alert.accept();
            }else {
                alert.dismiss();
            }
            getPromptFromAlert();
        }
    }
    public void getPromptFromAlert() {
        LOGGER.debug(promptBoxAlertReturnConfirmation.getText());
    }
    public void goToFakeAlert() {
        driver.get(ALERTS_SECOND_EXEMPLE_URL);
    }
    public void openAndCloseFakeAlert() {
        for (int i = 0; i <= 1; i++) {
            Actions actions = new Actions(driver);
            actions.moveToElement(fakeAlertButton).click().build().perform();
            if (i == 0) {
                LOGGER.debug(fakeAlertText.getText());
                fakeAlertOkButton.click();
                Assert.assertTrue(fakeAlertButton.isDisplayed());
            }else {
                LOGGER.debug(fakeAlertText.getText());
                actions.click(fakeAlertBackground).build().perform();
                Assert.assertTrue(fakeAlertButton.isDisplayed());
            }
        }
    }
    public void goToFormFirstWindow() {
        driver.get(FORMS_WINDOWS_FIRST_EXEMPLE_URL);
    }
    public void fillFromDetails() {
        datePickerTextBox.clear();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatedDateTime = now.format(formatter);
        datePickerTextBox.sendKeys(formatedDateTime);
        monthField.clear();
        monthField.sendKeys("12");
        monthField.sendKeys(Keys.TAB);
        monthField.sendKeys("2025");
        dateTimePickerTextBox.clear();
        dateTimePickerTextBox.sendKeys(formatedDateTime);
        dateTimePickerTextBox.sendKeys(Keys.TAB);
        dateTimePickerTextBox.sendKeys("02");
        dateTimePickerTextBox.sendKeys(Keys.TAB);
        dateTimePickerTextBox.sendKeys("32");
    }

    public void goToFormSecondWindow() {
        driver.get(FORMS_WINDOWS_SECOND_EXEMPLE_URL);
    }
    public void clickOnFirstJumpLink() {
        firstJumpLink.click();
    }
    public void switchToNewTab() {
        this.parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window: windowHandles) {
            if  (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }
    public void goBackToParentWindow() {
        driver.close();
        driver.switchTo().window(parentWindow);
    }
    public void printScreenNoSuchElementException() {
        try {
            driver.get(ALERTS_FIRST_EXEMPLE_URL);
            driver.findElement(By.id("elementCareNuExista")).click();
        } catch (NoSuchElementException e) {
            ScreenShot_Service.takeScreenshot(driver);
        } finally {
            driver.quit();
        }
    }

    public String getCurrentUrl() {return driver.getCurrentUrl();}
}
