package homework.andreiB.homework.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MakeAppointmentPage {

    private WebDriver driver;
    
    private By facilitySelect = By.xpath("//select[@id='combo_facility']");
    private By hospitalCheckbox = By.xpath("//input[@id='chk_hospotal_readmission']");
    private By healthcareRadio = By.xpath("//input[@id='radio_program_medicaid']");
    private By visitDateField = By.xpath("//input[@id='txt_visit_date']");
    private By commentField = By.xpath("//textarea[@id='txt_comment']");
    private By bookButton = By.xpath("//button[@id='btn-book-appointment']");

    public MakeAppointmentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFacility(String value) {
        WebElement dropdown = driver.findElement(facilitySelect);
        dropdown.sendKeys(value);
    }

    public void checkHospitalReadmission() {
        driver.findElement(hospitalCheckbox).click();
    }

    public void chooseHealthcareProgram() {
        driver.findElement(healthcareRadio).click();
    }

    public void setVisitDate(String date) {
        driver.findElement(visitDateField).sendKeys(date);
    }

    public void enterComment(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }

    public void clickBook() {
        driver.findElement(bookButton).click();
    }


}
