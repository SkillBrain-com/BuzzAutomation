package homework.PaulaVasiliu.Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagina1 {


    @FindBy(xpath = "//a[normalize-space()='Index']")
    public WebElement link1;
    @FindBy(xpath = "//a[normalize-space()='Page']")
    public WebElement link2;
    @FindBy(xpath = "//a[normalize-space()='About']")
    public WebElement link3;
    @FindBy(xpath = "//h1[normalize-space()='Basic Web Page Example']")
    public WebElement title;
    @FindBy(css = "div[class='explanation'] p")
    public WebElement subTitle;
    @FindBy(xpath = "(//p[@id='para1'])[1]")
    public WebElement paragraph1;
    @FindBy(css = "#para2")
    public WebElement paragraph2;
    @FindBy(xpath = "//a[normalize-space()='EvilTester.com']")
    public WebElement hyperLink1;
    @FindBy(xpath = "(//a[normalize-space()='Compendium Developments'])[1]")
    public WebElement hyperLink2;



    public Pagina1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}