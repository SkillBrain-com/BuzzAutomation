package homework.Marco.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "path_catre_chromedriver.exe");
        return new ChromeDriver();
    }
}
