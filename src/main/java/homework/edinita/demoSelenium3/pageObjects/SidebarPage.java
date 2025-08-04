package homework.edinita.demoSelenium3.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SidebarPage {
    public SidebarPage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "nav.mt-2 .nav-item.has-treeview:nth-child(2)")
    private WebElement catalogLing;
    @FindBy(css = ".nav-item a[href='/Admin/Product/List']")
    private WebElement productListLink;

    public WebElement getCatalogLing() {
        return catalogLing;
    }

    public WebElement getProductListLink() {
        return productListLink;
    }
}
