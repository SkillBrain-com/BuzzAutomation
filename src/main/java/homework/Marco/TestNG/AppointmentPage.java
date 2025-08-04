package homework.Marco.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppointmentPage {

    WebDriver driver;

    private final By facilityDropdown = By.id("combo_facility");
    private final By hospitalReadmissionCheckbox = By.id("chk_hospotal_readmission");
    private final By healthcareProgramRadio = By.id("radio_program_medicaid");
    private final By visitDateInput = By.id("txt_visit_date");
    private final By commentInput = By.id("txt_comment");
    private final By bookAppointmentButton = By.id("btn-book-appointment");

    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void completeAppointmentForm(String date, String comment) {
        driver.findElement(facilityDropdown).sendKeys("Seoul CURA Healthcare Center");
        driver.findElement(hospitalReadmissionCheckbox).click();
        driver.findElement(healthcareProgramRadio).click();
        driver.findElement(visitDateInput).sendKeys(date);
        driver.findElement(commentInput).sendKeys(comment);
        driver.findElement(bookAppointmentButton).click();
    }
}
