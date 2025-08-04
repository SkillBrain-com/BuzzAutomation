package homework.PasaricaAndrei.Sel3;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class Ex3 {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testpages.herokuapp.com/styled/refresh");
    }

    @Test
    public void testRefreshIdChanges() {
        WebElement idElement = driver.findElement(By.id("refreshdate"));

        long firstId = Long.parseLong(idElement.getText().trim());

        driver.navigate().refresh();

        WebElement newIdElement = driver.findElement(By.id("refreshdate"));
        long secondId = Long.parseLong(newIdElement.getText().trim());

        assertNotEquals(firstId, secondId, "ID-ul ar trebui să se modifice după refresh");

        long currentTime = System.currentTimeMillis();
        long delta = Math.abs(currentTime - secondId);

        assertTrue(delta < 5000, "ID-ul ar trebui să fie apropiat de timestamp-ul curent");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

