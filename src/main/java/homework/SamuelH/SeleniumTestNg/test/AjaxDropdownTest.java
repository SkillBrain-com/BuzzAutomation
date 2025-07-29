package homework.SamuelH.SeleniumTestNg.test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

    public class AjaxDropdownTest {
        private WebDriver driver;
        private WebDriverWait wait;

        @BeforeClass
        public void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        }

        @Test
        public void testDropdownSelection() {

            Select categorySelect = new Select(driver.findElement(By.id("combo1")));
            categorySelect.selectByVisibleText("Server");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#combo2 option[value='23']")));

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("combo2")));
            Select languageSelect = new Select(dropdown);
            languageSelect.selectByVisibleText("C#");

            driver.findElement(By.name("submitbutton")).click();

            WebElement categoryResult = driver.findElement(By.id("_valuelanguage_id"));
            WebElement languageResult = driver.findElement(By.id("_valuelanguage_id"));

            Assert.assertTrue(driver.getPageSource().contains("Server"), "Categoria nu este corectă.");
            Assert.assertTrue(driver.getPageSource().contains("C#"), "Limbajul nu este corect.");
        }

        @AfterClass
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }

