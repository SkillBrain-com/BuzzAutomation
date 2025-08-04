package homework.edinita.seleniumBasicPartTwo_Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class Base_Page {
    private static Logger LOGGER = LoggerFactory.getLogger(Setup_Driver.class);

    protected WebDriver driver;
    protected WebDriverWait wait;

    public Base_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setWait() {
        if (wait == null) {
            String timeout = Read_Config_File.readConfigFile().getProperty("timeout");
            wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(timeout)));
        }
    }
    public WebDriverWait getWait() {
        return wait;
    }
}
