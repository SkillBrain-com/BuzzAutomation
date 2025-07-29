package homework.MihaiAlexe.Selenium3TestNG.ajax.tests;

import ajax.base.TestBaseAjax;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class RedirectTest extends TestBaseAjax {

    @Test
    public void testRedirectPage() {
        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");


        driver.findElement(By.id("delaygotobasic")).click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("redirected"));


        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("redirected"), "Nu s-a făcut redirectul corect!");


        System.out.println("Redirectul a fost realizat cu succes, URL-ul curent este: " + currentUrl);
    }
}
