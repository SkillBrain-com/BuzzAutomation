package homework.MihaiAlexe.Selenium3TestNG.cura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AppointmentPage {
    private WebDriver driver;

    private By facilityDropdown = By.id("combo_facility");
    private By hospitalReadmissionCheckbox = By.id("chk_hospotal_readmission");
    private By healthcareProgramRadio = By.id("radio_program_medicare");
    private By visitDateInput = By.id("txt_visit_date");
    private By commentField = By.id("txt_comment");
    private By bookButton = By.id("btn-book-appointment");

    private By confirmationSection = By.id("summary");

    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillForm(String date, String comment, boolean selectProgram) {
        Select facility = new Select(driver.findElement(facilityDropdown));
        facility.selectByVisibleText("Hongkong CURA Healthcare Center");

        driver.findElement(hospitalReadmissionCheckbox).click();

        if (selectProgram) {
            driver.findElement(healthcareProgramRadio).click();
        }

        if (date != null && !date.isEmpty()) {
            driver.findElement(visitDateInput).sendKeys(date);
        }

        if (comment != null) {
            driver.findElement(commentField).sendKeys(comment);
        }

        driver.findElement(bookButton).click();
    }
    public void fillForm(String comment) {
        fillForm("2025-07-30", comment, true);
    }

    public boolean isConfirmationDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement confirmationHeader = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Appointment Confirmation']"))
            );
            return confirmationHeader.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
