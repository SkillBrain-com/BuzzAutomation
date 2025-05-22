package factory;

import enums.WebDrivers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.ChromeDriverOption;
import utilities.EdgeDriverOptions;
import utilities.PropertyUtils;

public class DriverFactory implements DriverManager {

    private static Logger LOGGER = LoggerFactory.getLogger(DriverFactory.class);

    @Override
    public WebDriver getDriver() {
        LOGGER.debug("Starting UI test with the following browser...");
        String browser = PropertyUtils.loadProperties().getProperty("browser");
        switch (WebDrivers.valueOf(browser.toUpperCase())) {
            case CHROME:
                LOGGER.debug("Returning chromedriver");
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = ChromeDriverOption.getChromeOptions();
                return new ChromeDriver(chromeOptions);
            case FIREFOX:
                LOGGER.debug("Returning fireFoxDriver");
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case EDGE:
                LOGGER.debug("Returning edgeDriver");
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver(EdgeDriverOptions.getEdgeOptions());
            default:
                throw new IllegalStateException("Unexpected browser type: ");
        }

    }
}
