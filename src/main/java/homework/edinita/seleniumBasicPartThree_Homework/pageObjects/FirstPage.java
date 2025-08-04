package homework.edinita.seleniumBasicPartThree_Homework.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FirstPage {
    public static final String LANGUAGE_OPTIONS_LIST = "//select[@id=\"combo2\"] //option";
    public FirstPage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id=\"combo1\"]")
    private WebElement categoryDropdown;
    @FindBy(xpath = "//select[@id=\"combo1\"] //option")
    List<WebElement> categoryOptions;
    @FindBy(xpath = "//select[@id=\"combo2\"]")
    private WebElement languageDropdown;
    @FindBy(xpath = "//select[@id=\"combo2\"] //option")
    List<WebElement> languageOptions;
    @FindBy(xpath = "//input[@name=\"submitbutton\"]")
    private WebElement submitButton;
    @FindBy(xpath ="//li[@id=\"_valuelanguage_id\"]")
    private WebElement languageID;
    @FindBy(id = "back_to_form")
    private WebElement backToFormButton;
    @FindBy(id ="ajaxBusy")
    private WebElement lodingIcon;
    @FindBy(xpath = "//li //parent::ul //parent::div //p //strong[text()='language_id']")
    private WebElement languageID2;

    public WebElement getCategoryDropdown() {
        return categoryDropdown;
    }

    public List<WebElement> getCategoryOptions() {
        return categoryOptions;
    }

    public WebElement getLanguageDropdown() {
        return languageDropdown;
    }

    public List<WebElement> getLanguageOptions() {
        return languageOptions;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getLanguageID() {
        return languageID;
    }

    public WebElement getBackToFormButton() {
        return backToFormButton;
    }

    public WebElement getLodingIcon() {
        return lodingIcon;
    }

    public WebElement getLanguageID2() {
        return languageID2;
    }
}
