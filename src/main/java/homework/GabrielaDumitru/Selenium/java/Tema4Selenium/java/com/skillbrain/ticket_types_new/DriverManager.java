package homework.GabrielaDumitru.Selenium.java.Tema4Selenium.java.com.skillbrain.ticket_types_new;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Map;
public class DriverManager {





        private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

        public static WebDriver getDriver(String profile) {
            if (driver.get() == null) {
                WebDriverManager.chromedriver().setup();

                ChromeOptions options = new ChromeOptions();
                if ("mobile".equalsIgnoreCase(profile)) {
                    options.setExperimentalOption("mobileEmulation", Map.of("deviceName", "Pixel 2"));
                } else {
                    options.addArguments("--start-maximized");
                }
                driver.set(new ChromeDriver(options));
            }
            return driver.get();
        }

        public static void quitDriver() {
            if (driver.get() != null) {
                driver.get().quit();
                driver.remove();
            }
        }
    }


