package homework.GabrielaDumitru.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pagini {
    private WebDriver driver;
    private By makeAppointmentBtn = By.id("btn-make-appointment");

    public Pagini (WebDriver driver) {
        this.driver = driver;
    }

    public void clickMakeAppointment() {
        driver.findElement(makeAppointmentBtn).click();
    }
}

