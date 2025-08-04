package homework.edinita.demoSelenium2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserManager {
    public static ChromeDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.addArguments("--disable-popup-blocking");
        return new ChromeDriver(chromeOptions);
    }
}
