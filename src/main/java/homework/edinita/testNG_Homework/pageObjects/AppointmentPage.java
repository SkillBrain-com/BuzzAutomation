package homework.edinita.testNG_Homework.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentPage {
    public AppointmentPage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "txt_visit_date")
    private WebElement dateTextBox;
    @FindBy(id = "btn-book-appointment")
    private WebElement bookAppointmentButton;
    @FindBy(id = "txt_comment")
    private WebElement commentTextBox;

    public WebElement getDateTextBox() {
        return dateTextBox;
    }

    public WebElement getBookAppointmentButton() {
        return bookAppointmentButton;
    }

    public WebElement getCommentTextBox() {
        return commentTextBox;
    }
}
