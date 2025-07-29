package homework.SamuelH.SeleniumTestNg.seleniumcomplet;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestPages {

    public static ChromeDriver createChromeDriver() {
      setProperties ("webdriver.chrome.driver", "src/test/resources/chromedriver-win32/chromedriver.exe");
      return new ChromeDriver();
    }

    private static void setProperties(String s, String s1) {

    }
}
