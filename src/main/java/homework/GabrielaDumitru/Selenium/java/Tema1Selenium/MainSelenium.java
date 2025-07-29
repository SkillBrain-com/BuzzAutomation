package homework.GabrielaDumitru.Selenium.java.Tema1Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class MainSelenium {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://testpages.eviltester.com/styled/index.html");

    }
}
