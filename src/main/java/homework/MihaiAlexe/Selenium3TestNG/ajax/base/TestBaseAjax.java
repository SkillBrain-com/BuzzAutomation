package homework.MihaiAlexe.Selenium3TestNG.ajax.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class TestBaseAjax {

    protected WebDriver driver;

    @Parameters("env")  // parametru pentru suite (mobile / desktop)
    @BeforeMethod
    public void setUp(@Optional("desktop") String env) {
        ChromeOptions options = new ChromeOptions();

        if ("mobile".equalsIgnoreCase(env)) {
            Map<String, String> mobileEmulation = new HashMap<>();
            mobileEmulation.put("deviceName", "Pixel 2");
            options.setExperimentalOption("mobileEmulation", mobileEmulation);
        } else {
            options.addArguments("start-maximized");
        }

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
