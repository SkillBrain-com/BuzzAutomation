package homework.edinita.testNG_Homework.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "menu-toggle")
    private WebElement menuToggleButton;
    @FindBy(xpath = "//a[contains(.,\"Login\")]")
    private WebElement loginButton;
    @FindBy(xpath = "//a[contains(.,\"Home\")]")
    private WebElement homeButton;
    @FindBy(xpath = "//a[contains(.,\"Make Appointment\")]")
    private WebElement makeAppointmentButton;
    @FindBy(xpath = "//p[@class=\"lead text-danger\"]")
    private WebElement errorMessage;
    @FindBy(id ="btn-book-appointment")
    private WebElement bookAppointmentButton;
    @FindBy(xpath = "//th[contains(.,\"Su\")]")
    private WebElement presentsOfCalendar;
    @FindBy(id = "txt_visit_date")
    private WebElement dateTextBox;

    public WebElement getMenuToggleButton() {
        return menuToggleButton;
    }
    public WebElement getLoginButton() {
        return loginButton;
    }
    public WebElement getHomeButton() {
        return homeButton;
    }
    public WebElement getMakeAppointmentButton() {
        return makeAppointmentButton;
    }
    public WebElement getErrorMessage() {
        return errorMessage;
    }
    public WebElement getBookAppointmentButton() {
        return bookAppointmentButton;
    }
    public WebElement getPresentsOfCalendar() {
        return presentsOfCalendar;
    }
    public WebElement getDateTextBox() {
        return dateTextBox;
    }
}
