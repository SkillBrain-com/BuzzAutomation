package homework.edinita.seleniumBasicPartOne_Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class HerokuApp_Exemples extends Base_Page {
    private static final String FIRST_EXEMPLE_URL="https://testpages.eviltester.com/styled/basic-web-page-test.html";
    private static final String SECOND_EXEMPLE_URL="https://testpages.eviltester.com/styled/attributes-test.html";
    private static final String THIRD_EXEMPLE_URL="https://testpages.eviltester.com/styled/find-by-playground-test.html#pName1";
    private static final String FORTH_EXEMPLE_URL="https://testpages.eviltester.com/styled/webdriver-example-page?number-entry=one%2C+two";
    private static Logger LOGGER = LoggerFactory.getLogger(HerokuApp_Exemples.class);

    public HerokuApp_Exemples(WebDriver driver) {super(driver);}

    @FindBy(id = "para1")
    static WebElement paragraph;

    @FindBy(id = "para2")
    static WebElement paragraph2;

    @FindBy(id = "domattributes")
    static WebElement paragraph3;

    @FindBy(id = "jsattributes")
    static WebElement paragraph4;

    @FindBy(id = "jsautoattributes")
    static WebElement paragraph5;

    @FindBy(xpath = "//p[@class='normal']")
    static List<WebElement> paragraphs;

    @FindBy(id = "para1")
    static WebElement paragraph6;

    @FindBy(id = "para2")
    static WebElement paragraph7;

    @FindBy(xpath = "//li[@class='example-list-item']")
    static List<WebElement> itemList;

    @FindBy(id = "numentry")
    static WebElement numberEntry;

    @FindBy(id = "show-as-para")
    static WebElement showAsParagraphButton;

    @FindBy(id = "message")
    static WebElement messageParagraph;

    public static WebElement getParagraph() {
        return paragraph;
    }
    public static WebElement getParagraph2() {
        return paragraph2;
    }
    public static WebElement getParagraph3() {
        return paragraph3;
    }
    public static WebElement getParagraph4() {
        return paragraph4;
    }
    public static WebElement getParagraph5() {
        return paragraph5;
    }
    public static WebElement getParagraph6() {
        return paragraph6;
    }
    public static WebElement getParagraph7() {
        return paragraph7;
    }
    public static WebElement getMessageParagraph() {
        return messageParagraph;
    }

    public static void getTextParagraph(WebElement paragraph) {
        System.out.println(paragraph.getText());
    }

    public void getToFirstExemple() {driver.get(FIRST_EXEMPLE_URL);}
    public void getToSecondExemple() {driver.get(SECOND_EXEMPLE_URL);}
    public void getToThirdExemple() {driver.get(THIRD_EXEMPLE_URL);}
    public void getToForthExemple() {driver.get(FORTH_EXEMPLE_URL);}
    public void getTextFromListOfParagraphs() {paragraphs.forEach(paragraph -> System.out.println(paragraph.getText()));}
    public void getTextFromListOfItems() {itemList.forEach(item -> System.out.println(item.getText()));}
    public void addKeysToNumberEntry(String number) {numberEntry.sendKeys(number);}
    public void clickShowAsParagraphButton() {showAsParagraphButton.click();}


    public String getCurrentUrl() {return driver.getCurrentUrl();}
}
