import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsTest {

    public static void main(String[] args) {

//        doubleClickMeTest();
//        rightClickMeTest();
//        TODO - click on third button on https://demoqa.com/buttons and getText() for the message ( <p> paragraph </p>)


    }

    private static void rightClickMeTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 1. got to /alerts page
        driver.get("https://demoqa.com/buttons");
        Actions actions = new Actions(driver);
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        // right click => contextClick()
        actions.contextClick(rightClickBtn).build().perform();
        try {
            String rightClickMessage = driver.findElement(By.id("rightClickMessage")).getText();
            System.out.println(rightClickMessage);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }
    }

    private static void doubleClickMeTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 1. got to /alerts page
        driver.get("https://demoqa.com/buttons");
        Actions actions = new Actions(driver);
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickBtn).build().perform();
        try {
            String doubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();
            System.out.println(doubleClickMessage);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }
    }
}
