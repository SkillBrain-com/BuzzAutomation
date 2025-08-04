package homework.CiovarnacheConstantinClaudiu.SeleniumTestNG.Selenium1.HerokuPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final String url = "https://testpages.herokuapp.com/styled/index.html";

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get(url);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("basicpagetest")));
    }

    public List<WebElement> getFirstLinks(int count) {
        return driver.findElements(By.xpath("(//div[@id='content']//a)[position() <= " + count + "]"));
    }

    public void clickLink(WebElement link) {
        wait.until(ExpectedConditions.elementToBeClickable(link)).click();
    }

    public void goBack() {
        driver.navigate().back();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("content")));
    }
}
