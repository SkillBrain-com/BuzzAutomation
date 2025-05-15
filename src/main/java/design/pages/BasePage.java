package design.pages;

import design.utilities.PropertyUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setWait() {
        if (wait == null) {
            String timeout = PropertyUtils.loadProperties().getProperty("timeout");
            wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(timeout)));
        }
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
