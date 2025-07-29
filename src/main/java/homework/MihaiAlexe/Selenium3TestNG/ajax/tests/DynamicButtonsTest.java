package homework.MihaiAlexe.Selenium3TestNG.ajax.tests;

import ajax.base.TestBaseAjax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class DynamicButtonsTest extends TestBaseAjax {

    @Test
    public void testAllButtonsClickedMessage() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        for (int i = 0; i < 4; i++) {
            String buttonId = String.format("button0%d", i);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id(buttonId)));
            button.click();
        }

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buttonmessage")));
        String messageText = message.getText();

        assertEquals(messageText, "All Buttons Clicked", "Mesajul final nu este cel așteptat!");

        System.out.println("Toate cele 4 butoane au fost apăsate și mesajul final este corect.");
    }
}
