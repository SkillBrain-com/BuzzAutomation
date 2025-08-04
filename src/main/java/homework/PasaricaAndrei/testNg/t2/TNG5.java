package homework.PasaricaAndrei.testNg.t2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import testNg.t1.TNG2;

import static org.junit.jupiter.api.Assertions.*;

public class TNG5 extends TNG2 {

    @Test
    public void homeButtonAlwaysReturnsToHomepage() {
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.linkText("Login")).click();

        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.linkText("Home")).click();

        assertEquals("https://katalon-demo-cura.herokuapp.com/", driver.getCurrentUrl());
    }
}

