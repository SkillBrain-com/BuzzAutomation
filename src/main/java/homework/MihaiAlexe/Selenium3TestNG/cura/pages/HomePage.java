package homework.MihaiAlexe.Selenium3TestNG.cura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    private By menuToggle = By.id("menu-toggle");
    private By loginLink = By.linkText("Login");
    private By homeButton = By.linkText("Home");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginFromMenu() {
        driver.findElement(menuToggle).click();
        driver.findElement(loginLink).click();
    }

    public void clickHomeButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Așteaptă ca meniul să fie disponibil și apoi dă click
        wait.until(ExpectedConditions.elementToBeClickable(menuToggle));
        driver.findElement(menuToggle).click();

        // Așteaptă ca butonul Home să apară
        wait.until(ExpectedConditions.elementToBeClickable(homeButton));
        driver.findElement(homeButton).click();
    }


}
