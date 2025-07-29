package homework.MihaiAlexe.Selenium3TestNG.ajax.tests;

import ajax.base.TestBaseAjax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class AjaxTest extends TestBaseAjax {

    @Test
    public void testDropdownSelections() {
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");

        Select categorySelect = new Select(driver.findElement(By.id("combo1")));
        categorySelect.selectByVisibleText("Server");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("combo2")));

        Select languageSelect = new Select(driver.findElement(By.id("combo2")));
        languageSelect.selectByVisibleText("Java");

        driver.findElement(By.name("submitbutton")).click();

        WebElement categoryResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_valueid")));
        WebElement languageResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_valuelanguage_id")));

        String categoryValue = categoryResult.getText();
        String languageValue = languageResult.getText();

        assertTrue(categoryValue.equals("3"), "Valoarea pentru Category nu este corectă!");
        assertTrue(languageValue.equals("23"), "Valoarea pentru Language nu este corectă!");


        System.out.println("Valoarea pentru Category este " + categoryValue + ", test reușit!");
        System.out.println("Valoarea pentru Language este " + languageValue + ", test reușit!");
    }

}
