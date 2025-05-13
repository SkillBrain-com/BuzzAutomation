import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert {

    public static void main(String[] args) {
//        firstAlertTest();
//        secondAlertTest();
//        TODO - create test case for last alert on the /alerts page
        // 1. got to /alerts page
        // 2. click on On button click, confirm box will appear
        // 3. click on cancel button
        // 4. fill in the input on the alert event with a string
        // 5. click on OK
        // 6. verify message is: You entered {yourMessage}

    }

    private static void secondAlertTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // 1. got to /alerts page
        driver.get("https://demoqa.com/alerts");
        // 2. click on On button click, confirm box will appear
        driver.findElement(By.id("confirmButton")).click();
        // 3. click on cancel button
        driver.switchTo().alert().dismiss();
//        driver.switchTo().alert().accept();

        // 4. verify chosen action result is displayed

        WebElement confirmResult =  driver.findElement(By.id("confirmResult"));
        String confirmMessage =  confirmResult.getText();

        System.out.println(confirmMessage);
        driver.close();
    }

    private static void firstAlertTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 1. got to /alerts page
        driver.get("https://demoqa.com/alerts");
        // 2. click on first click me button
        WebElement clickMeButton =  driver.findElement(By.id("alertButton"));
        clickMeButton.click();
        // 3. click on OK from alert popup
        try {
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
        } catch (InterruptedException exception) {
            String message = exception.getMessage();
            System.out.println(message);
        }

        driver.close();
    }
}
