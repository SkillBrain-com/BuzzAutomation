package homework.edinita.demoTestNG.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTests extends BaseTest {
    @Test(description = "Verify login scenario with different users", dataProvider = "loginUsers", groups = {"without_login"})
    public void testLoginScenarios(String username, String password, boolean shouldLogin, boolean shouldWait) throws InterruptedException {
        loginSteps(username, password);
        if(shouldLogin) {
            assertTrue("User is not taken to the right page after login",
                    driver.getCurrentUrl().contains("inventory.html"));
            List<WebElement> inventoryItems = driver.findElements(By.cssSelector(".inventory_item"));
            assertFalse("No items are present after succesful login",
                    inventoryItems.isEmpty());
            for (WebElement item : inventoryItems) {
                assertTrue("Items are not displayed after login",
                        item.isDisplayed());
            }
        } else {
            assertFalse("User is taken to the items page after login with a user that should not see that page",
                    driver.getCurrentUrl().contains("inventory.html"));
            if (shouldWait) {
                Thread.sleep(5000);
            }
            assertTrue("Error message is not present after login with a user that should not see items page",
                    isElementPresent(By.cssSelector("h3[data-test='error']")));
        }
    }
    @DataProvider
    public Object[][] loginUsers(){
        return new Object[][]{
                {"standard_user", "secret_sauce", true, false},
                {"locked_out_user", "secret_sauce", false, false},
                {"problem_user", "secret_sauce", true, false},
                {"performance_glitch_user", "secret_sauce", true, true}
        };
    }
}
