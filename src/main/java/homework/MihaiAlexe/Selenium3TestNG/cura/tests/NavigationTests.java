package homework.MihaiAlexe.Selenium3TestNG.cura.tests;

import cura.base.TestBaseCura;
import cura.pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends TestBaseCura {

    @Test
    public void homeButtonRedirectsToHomepage() {
        // Accesează o pagină oarecare
        driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");

        HomePage home = new HomePage(driver);
        home.clickHomeButton();  // va trebui să adaugi acest method în HomePage

        // Verifică dacă URL-ul este cel al homepage-ului
        assertTrue(driver.getCurrentUrl().equals("https://katalon-demo-cura.herokuapp.com/"));
    }
}
