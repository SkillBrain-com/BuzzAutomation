package design.utilities;

import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChromeDriverOption {

    private static Logger LOGGER = LoggerFactory.getLogger(ChromeDriverOption.class);

    public static ChromeOptions getChromeOptions() {
        LOGGER.debug("Starting Chrome Options...");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.addArguments("--disable-popup-blocking");
        LOGGER.debug("Chrome options setup successfully...");
        return chromeOptions;
    }
}
