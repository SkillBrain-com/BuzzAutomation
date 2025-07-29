package homework.SamuelH.SeleniumTestNg.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Instant;

public class RefreshIdTest {
    @Test
public void testIdChangesOnRefreshAndMatchesCurrentTimestamp() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    try {
        driver.get("https://testpages.herokuapp.com/styled/refresh");

        long firstId = getIdFromPage(driver);
        System.out.println("First ID: " + firstId);

        long currentTimestamp = Instant.now().getEpochSecond();
        long delta = 5; // toleranță de 5 secunde
        Assert.assertEquals("ID-ul trebuie să fie apropiat de timpul actual", currentTimestamp);

        Thread.sleep(2000);
        driver.navigate().refresh();

        long secondId = getIdFromPage(driver);
        System.out.println("Second ID: " + secondId);

        Assert.assertNotEquals(firstId, secondId, "ID-ul ar trebui să fie diferit după refresh");

        long newTimestamp = Instant.now().getEpochSecond();
        Assert.assertEquals ("Noul ID trebuie să fie apropiat de timpul actual", newTimestamp);

    } finally {
        driver.quit();
    }
}

    private long getIdFromPage(WebDriver driver) {
        WebElement idElement = driver.findElement(By.id("refreshdate"));
        String text = idElement.getText(); // Exemplu: "Your new ID is: 1721991823"
        String idStr = text.replaceAll("\\D+", ""); // extrage doar cifre
        return Long.parseLong(idStr);
    }
}

