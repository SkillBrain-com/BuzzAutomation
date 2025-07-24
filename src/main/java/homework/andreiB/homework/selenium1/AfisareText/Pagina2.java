package homework.andreiB.homework.selenium1.AfisareText;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagina2 {
    @FindBy(css = "div[class='page-body'] h1")
    public WebElement title1;
    @FindBy(xpath = "//p[contains(text(),'Elements can have attributes. This test page has s')]")
    public WebElement subTitle1;
    @FindBy(xpath = "(//h2[normalize-space()='Custom Attribute and JavaScript Added'])[1]")
    public WebElement title2;
    @FindBy(xpath = "/(//p[contains(text(),'The next paragraph has attributes. Some are custom')])[1]")
    public WebElement paragraph1;
    @FindBy(css = "#domattributes")
    public WebElement subTitle;
    @FindBy(xpath = "(//h2[normalize-space()='Dynamic JavaScript Added'])[1]")
    public WebElement subTitle2;
    @FindBy(css = "body > div:nth-child(1) > p:nth-child(11)")
    public WebElement paragraph2;
    @FindBy(xpath = "//p[@id='jsattributes']")
    public WebElement dynamicParagraph1;
    @FindBy(xpath = "//p[@nextid='15']")
    public WebElement dynamicParagraph2;
    @FindBy(xpath = "//button[normalize-space()='Add Another Attribute']")
    public WebElement nextIdButton;
    @FindBy(xpath = "//h2[normalize-space()='Auto Dynamically Updating Attributes']")
    public WebElement title3;
    @FindBy(xpath = "//p[contains(text(),'The next paragraph has a static id, and attributes')]")
    public WebElement paragraph3;
    @FindBy(xpath = "//p[@id='jsautoattributes']")
    public WebElement paragraph4;

    public Pagina2(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


//
//    public void clickOnNextIdButtonButton() {
//        WebElement Pagina2 ;
//        ExpectedCondition<WebElement> webElementExpectedCondition;
//        webElementExpectedCondition = ExpectedConditions.elementToBeClickable(nextIdButton);
//        nextIdButton.click();


//    public SearchContext driver = null;
//        Pagina2(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }
}
    
