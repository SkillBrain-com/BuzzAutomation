package homework.MihaiAlexe.Selenium3TestNG.ajax.tests;

import ajax.base.TestBaseAjax;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RefreshTest extends TestBaseAjax {

    @Test
    public void testRefreshIdMatchesTimestamp() {
        driver.get("https://testpages.herokuapp.com/styled/refresh");

        String initialIdStr = driver.findElement(By.id("embeddedrefreshdatevalue")).getText();
        long initialId = Long.parseLong(initialIdStr);

        driver.findElement(By.id("button")).click();

        String refreshedIdStr = initialIdStr;
        int retries = 0;
        while (refreshedIdStr.equals(initialIdStr) && retries < 20) { // 20 x 500ms = 10 sec
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            refreshedIdStr = driver.findElement(By.id("embeddedrefreshdatevalue")).getText();
            retries++;
        }

        long refreshedId = Long.parseLong(refreshedIdStr);

        long currentTimestamp = System.currentTimeMillis();
        long delta = 3000; // 3 secunde toleranță
        long diff = Math.abs((currentTimestamp / 1000) - refreshedId);  // ✅ comparăm secunde cu secunde

        assertTrue(diff <= delta, "ID-ul nu este apropiat de timestamp-ul curent!");

        System.out.println(" Test reușit: ID-ul este sincronizat cu timestamp-ul actual.");
        System.out.println("ID inițial: " + initialId);
        System.out.println("ID după refresh: " + refreshedId);
        System.out.println("Timestamp actual: " + currentTimestamp);
        System.out.println("Diferență: " + diff + " ms (delta permis: " + delta + " ms)");
    }
}
