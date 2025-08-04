package homework.edinita.seleniumBasicPartOne_Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Setup_Driver implements Driver_Manager {
    private static Logger LOGGER = LoggerFactory.getLogger(Setup_Driver.class);

    @Override
    public WebDriver getDriverFromConfigFile() {
        LOGGER.debug("Strating UI test with the following browser...");
        String browser = Read_Config_File.readConfigFile().getProperty("browser");
        switch (Web_Drivers.valueOf(browser.toUpperCase())) {
            case CHROME:
                LOGGER.debug("Returning chromedriver");
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = ChromeDriver_Options.getChromeOptions();
                return new ChromeDriver(chromeOptions);
            case FIREFOX:
                LOGGER.debug("Returning fireFoxDriver");
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case EDGE:
                LOGGER.debug("Returning edgeDriver");
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            default:
                throw new IllegalStateException("Unexpected browser type: ");
        }
    }
}
