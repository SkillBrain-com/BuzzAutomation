package homework.GabrielaDumitru.Selenium.java.Tema3Selenium.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By makeAppointmentButton = By.id("btn-make-appointment");
    By menuToggle = By.id("menu-toggle");
    By loginLink = By.linkText("Login");
    By homeLink = By.linkText("Home");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMakeAppointment() {
        driver.findElement(makeAppointmentButton).click();
    }

    public void openMenu() {
        driver.findElement(menuToggle).click();
    }

    public void clickLoginMenu() {
        openMenu();
        driver.findElement(loginLink).click();
    }

    public void clickHome() {
        openMenu();
        driver.findElement(homeLink).click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
