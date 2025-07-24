package homework.andreiB.homework.selenium1.AfisareText;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pagina4 {

    @FindBy(xpath = "//h1[normalize-space()='Example Page Heading One']")
    public WebElement titlu;
    @FindBy(xpath = "//p[@data-locator='explanation-para']")
    public WebElement subtitlu;
    @FindBy(css = "#para1")
    public WebElement paragraf1;
    @FindBy(css = "#para2")
    public WebElement paragraf2;
    @FindBy(xpath = "//li[normalize-space()='List Item 1']")
    public WebElement item1;
    @FindBy(xpath = "//li[normalize-space()='List Item 2']")
    public WebElement item2;
    @FindBy(xpath = "//li[normalize-space()='List Item 3']")
    public WebElement item3;
    @FindBy(xpath = "//label[normalize-space()='Enter some numbers:']")
    public WebElement paragraf3;
    @FindBy(xpath = "//input[@id='numentry']")
    public WebElement textBox;
    @FindBy(xpath = "//input[@id='submit-to-server']")
    public WebElement button1;
    @FindBy(xpath = "//button[@id='show-as-alert']")
    public WebElement button2;
    @FindBy(xpath = "//button[@id='show-as-para']")
    public WebElement button3;
    @FindBy(xpath = "//a[@id='clickable-link']")
    public WebElement link;


    public Pagina4(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
