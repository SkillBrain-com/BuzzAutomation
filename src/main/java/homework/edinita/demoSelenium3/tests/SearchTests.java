package homework.edinita.demoSelenium3.tests;

import demoSelenium3.pageObjects.LoginPage;
import demoSelenium3.pageObjects.ProductEditPage;
import demoSelenium3.pageObjects.ProductPage;
import demoSelenium3.pageObjects.SidebarPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static demoSelenium3.pageObjects.ProductPage.EMPTY_PRODUCT_LIST_CSS;
import static demoSelenium3.pageObjects.ProductPage.PRODUCT_LIST_CSS;
import static org.testng.AssertJUnit.assertFalse;

public class SearchTests extends BaseTest {
    @BeforeClass
    public void beforeClass() {
        driver.get("https://admin-demo.nopcommerce.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getLoginForm().submit();
    }
    @Test(description = "Verify that search is successful when searching for products by name")
    public void testSearchByProductName() {
        SidebarPage sidebarPage = new SidebarPage(driver);
        sidebarPage.getCatalogLing().click();
        getWait(driver);
        sidebarPage.getProductListLink().click();

        ProductPage productPage = new ProductPage(driver);
        productPage.getProductName().sendKeys("Adobe Photoshop");
        productPage.getSearchButton().click();
        getWait(driver).until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(PRODUCT_LIST_CSS), 1));
        assertEquals("Search did not return the expected products",
                1, productPage.getProductList().size());
        assertEquals("Product titles list has different size than product list",
                productPage.getProductList().size(), productPage.getProductTitles().size());
        assertEquals("Search product title is not correct",
                "Adobe Photoshop", productPage.getProductTitles().get(0).getText());
    }
    @Test(description = "Verify that after editing a product's name, it is not longer in the search list")
    public void testEditProductName() {
        driver.get("https://admin-demo.nopcommerce.com/Admin/Product/List");
        ProductPage productPage = new ProductPage(driver);
        getWait(driver).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector(PRODUCT_LIST_CSS), 0));
        assertNotEquals(productPage.getProductList().size(), 0,
                "No products present");
        WebElement firstProduct = productPage.getProductList().get(0);
        String firstProductTitle = productPage.getTitleFromProduct(firstProduct).getText();
        productPage.getEditButtonFromProduct(firstProduct).click();

        //edit product name
        ProductEditPage productEditPage = new ProductEditPage(driver);
        productEditPage.getProductName().clear();
        productEditPage.getProductName().sendKeys(RandomStringUtils.randomAlphabetic(10));
        productEditPage.getSaveButton().click();

        //research the old product name
        productPage.getProductName().sendKeys(firstProductTitle);
        productPage.getSearchButton().click();
        getWait(driver).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(PRODUCT_LIST_CSS)));
        assertEquals("Product list size after edit and search is not the expected one",
                1, productPage.getProductList().size());
        assertFalse("Product list is not empty when searching for an invalid product name", isElementPresent(By.cssSelector(EMPTY_PRODUCT_LIST_CSS)));

    }
}
