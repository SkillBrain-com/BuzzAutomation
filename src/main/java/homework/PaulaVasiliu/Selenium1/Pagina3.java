package homework.PaulaVasiliu.Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pagina3 {
    @FindBy(xpath = "//h1[normalize-space()='Find By Playground - Locator Examples']")
    public WebElement titlu;
    @FindBy(xpath = "//div[@class='explanation']")
    public WebElement subTitlu;
    @FindBy(xpath = "//div[@id='div1']")
    public WebElement toateParagrafele;


    public Pagina3(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
