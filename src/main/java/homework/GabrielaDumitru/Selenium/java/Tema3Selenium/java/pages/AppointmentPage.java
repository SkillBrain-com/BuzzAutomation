package homework.GabrielaDumitru.Selenium.java.Tema3Selenium.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppointmentPage {
    WebDriver driver;

    By commentBox = By.id("txt_comment");
    By bookButton = By.id("btn-book-appointment");

    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void submitAppointment(String comment) {
        driver.findElement(commentBox).sendKeys(comment);
        driver.findElement(bookButton).click();
    }

    public String getConfirmationTitle() {
        return driver.findElement(By.tagName("h2")).getText();
    }
}
