package homework.PasaricaAndrei.Sel3;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class Ex4 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
    }

    @Test
    public void testClickAllDynamicButtons() {
        WebElement startBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("button00")));
        startBtn.click();

        WebElement secondBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("button01")));
        secondBtn.click();

        WebElement thirdBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("button02")));
        thirdBtn.click();

        WebElement lastBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("button03")));
        lastBtn.click();

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buttonmessage")));
        String finalText = message.getText();

        assertEquals("All Buttons Clicked", finalText, "Mesajul final nu este corect");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

