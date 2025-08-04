package homework.edinita.demoTestNG.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class OrderTests extends BaseTest {
    @Test(description = "Verify that the add to cart functionality works", groups = {"with_login"})
    public void testAddToCartFunctionality() {
        WebElement shoppingCartButton = driver.findElement(By.cssSelector("a.shopping_cart_link"));
        List<WebElement> inventoryItems = driver.findElements(By.cssSelector(".inventory_item"));
        WebElement firstItem = inventoryItems.get(0);
        String firstItemTitle = firstItem.findElement(By.cssSelector(".inventory_item_name")).getText();
        String firstItemPrice = firstItem.findElement(By.className("inventory_item_price")).getText();
        WebElement firstItemButton = firstItem.findElement(By.cssSelector(".btn_inventory"));
        assertEquals("Add to cart button text is incorrect before adding an item to cart",
                "add to cart", firstItemButton.getText().toLowerCase());
        firstItemButton.click();
        assertEquals("Add to ccart button text is incorrect before adding an item to cart",
                "remove" ,firstItem.findElement(By.cssSelector(".btn_inventory")).getText().toLowerCase());
        assertTrue("Shopping cart badge is not present before adding eleements to cart",
                isElementPresent(By.xpath("//span[@class=\"shopping_cart_badge\"]")));
        assertEquals("Mumber of elements on shopping cart badge is incorrect",
                "1" ,driver.findElement(By.cssSelector("span.shopping_cart_badge")).getText());
        shoppingCartButton.click();
        assertTrue("User is not on cart page after navigating to cart",
                driver.getCurrentUrl().contains("cart.html"));
        List<WebElement> cartItems = driver.findElements(By.cssSelector(".cart_item"));
        assertEquals("Number of items in cart is incorrect",
               1 ,cartItems.size());
        String cartItemName = cartItems.get(0).findElement(By.cssSelector(".inventory_item_name")).getText();
        assertEquals("Wrong item added to cart",
                firstItemTitle , cartItemName);
        String cartItemPrice = cartItems.get(0).findElement(By.cssSelector(".inventory_item_price")).getText();
        assertEquals("Wrong item price added to cart",
                firstItemPrice ,cartItemPrice);
        assertTrue("Remove button on cart item is not present.",
                isElementPresent(cartItems.get(0), By.className("cart_button")));
        assertTrue("Continue shopping button is not present.",
                isElementPresent(By.id("continue-shopping")));
        assertTrue("Checkout button is not present.",
                isElementPresent(By.id("checkout")));
    }
}
