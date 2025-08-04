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

public class Ex5 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
    }

    @Test
    public void testClickAllDisabledButtons() {
        WebElement button00 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button00")));
        button00.click();

        WebElement button01 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button01")));
        button01.click();

        WebElement button02 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button02")));
        button02.click();

        WebElement button03 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button03")));
        button03.click();

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buttonmessage")));
        String text = message.getText();
        assertEquals("All Buttons Clicked", text, "Mesajul final nu este corect");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
