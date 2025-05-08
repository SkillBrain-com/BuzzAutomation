import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

    private static final String URL_DEMO_QA = "https://demoqa.com/";

//  TODO - extract void main code into separate method

    public static void main(String[] args) throws InterruptedException {
        // 1. Go to https://demoqa.com/
        // a. Setup Driver
        // b. Create driver
        // c. Use driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(URL_DEMO_QA);
        // 1.1 Identify WebElement
        WebElement forms = driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][2]"));
        //2. Click Forms card
        forms.click();

        //3. Verify URL is https://demoqa.com/forms

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        WebElement practiceForm = driver.findElement(By.xpath("//span[text()=\"Practice Form\"]"));
        practiceForm.click();

        WebElement firstName = driver.findElement(By.id("firstName"));

        firstName.sendKeys("Andrei");

        driver.findElement(By.id("lastName")).sendKeys("Rotaru");

        driver.findElement(By.id("userEmail")).sendKeys("test@test.com");

        driver.findElement(By.xpath("//label[text()='Female']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("1234567891");


        WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirthInput.click();
        WebElement calendar = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
        Select monthSelect = new Select(calendar);
        monthSelect.selectByVisibleText("August");
        // //div[@aria-label='Choose Thursday, August 7th, 2025']
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, August 7th, 2025']")).click();


        //4. Close browser (using driver)
        driver.close();

    }


}
