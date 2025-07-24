import factory.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DemoQaHomePage;

public class DemoTest {

    private static final String URL_DEMO_QA = "https://demoqa.com/";

//  TODO - extract void main code into separate method

    private WebDriver driver;
    private DemoQaHomePage demoQaHomePage;


    @BeforeTest
    public void init() {
//        DriverFactory driverFactory = new DriverFactory();
        RemoteDriverFactory driverFactory = new RemoteDriverFactory();
        driver = driverFactory.getDriver();
        demoQaHomePage = new DemoQaHomePage(driver);
    }

    @Test
    public void homePageTest() {
        driver.get(URL_DEMO_QA);
        demoQaHomePage.scrollToElement(driver, demoQaHomePage.getFormsCard());
        demoQaHomePage.clickOnFormsCard();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }




    public static void main(String[] args) throws InterruptedException {

//        WebElement practiceForm = driver.findElement(By.xpath("//span[text()=\"Practice Form\"]"));
//        practiceForm.click();
//
//        WebElement firstName = driver.findElement(By.id("firstName"));
//
//        firstName.sendKeys("Andrei");
//
//        driver.findElement(By.id("lastName")).sendKeys("Rotaru");
//
//        driver.findElement(By.id("userEmail")).sendKeys("test@test.com");
//
//        driver.findElement(By.xpath("//label[text()='Female']")).click();
//        driver.findElement(By.id("userNumber")).sendKeys("1234567891");
//
//
//        WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
//        dateOfBirthInput.click();
//        WebElement calendar = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
//        Select monthSelect = new Select(calendar);
//        monthSelect.selectByVisibleText("August");
//        // //div[@aria-label='Choose Thursday, August 7th, 2025']
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, August 7th, 2025']")).click();
//
//        //4. Close browser (using driver)
//        driver.close();

    }


}
