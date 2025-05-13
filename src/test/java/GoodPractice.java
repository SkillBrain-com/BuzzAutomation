import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//        TODO - create test case for last alert on the /alerts page || homeWork1()
// 1. got to /alerts page
// 2. click on On button click, confirm box will appear
// 3. click on cancel button
// 4. fill in the input on the alert event with a string
// 5. click on OK
// 6. verify message is: You entered {yourMessage}


//        TODO - click on third button on https://demoqa.com/buttons and getText() for the message ( <p> paragraph </p>) || homeWork2()





public class GoodPractice {

    private static final String URL_1 = "https://demoqa.com/";
    private static final String URL_2 = "https://demoqa.com/alerts";
    private static final String URL_3 = "https://demoqa.com/buttons";

    public static void main(String[] args) {

        homeWork2();

    }

    private static void homeWork2() {
        // TODO - setup a driver
        WebDriverManager.chromedriver().setup();

        // TODO - create a new driver
        WebDriver driver = new ChromeDriver();

        // TODO - adjust the driver
        driver.manage().window().maximize();

        // TODO - access the driver
        driver.get(URL_3);

        // TODO - click on third button on URL_3
        driver.findElement(By.xpath("//button[text()=\"Click Me\"]")).click();

        // TODO - print the text that you confirm you clicked the button
        System.out.println(driver.findElement(By.xpath("//p[text()=\"You have done a dynamic click\"]")).getText());


        // TODO - close the driver
        driver.close();
    }

    private static void homeWork1() {
        // TODO - setup a driver
        WebDriverManager.chromedriver().setup();

        // TODO - create a new driver
        WebDriver driver = new ChromeDriver();

        // TODO - adjust the driver
        driver.manage().window().maximize();

        // TODO - access the driver
        driver.get(URL_2);


        // TODO - click on "On button click, confirm box will appear"
        driver.findElement(By.id("confirmButton")).click();

        // TODO - click on cancel button on the alert
        driver.switchTo().alert().dismiss();

        // TODO - verify message is: You selected Cancel
        System.out.println(driver.findElement(By.id("confirmResult")).getText());

        // TODO - click on "On button click, prompt box will appear"
        driver.findElement(By.id("promtButton")).click();

        // TODO - click on input text box on the alert to enter a string
        driver.switchTo().alert().sendKeys("TEST911");

        // TODO - click on OK
        driver.switchTo().alert().accept();

        // TODO - verify message is: You entered {yourMessage}
        System.out.println(driver.findElement(By.xpath("//span[text()=\"You entered \"]")).getText());


        // TODO - close the driver
        driver.close();
    }


    private static void goodPractice() {
        // TODO - FINISH THE PREP and go to https://demoqa.com/


        //1. setup the driver
        WebDriverManager.chromedriver().setup();
        //2. create the driver
        WebDriver driver = new ChromeDriver();
        //3. adjust the driver
        driver.manage().window().maximize();
        //4. access the driver
        driver.get(URL_1);


        // TODO - go to https://demoqa.com/forms

        driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][2]")).click();


        // TODO - verify that you got to the right link after you clicked

        System.out.println(driver.getCurrentUrl());


        // TODO - click on the practice form button

        driver.findElement(By.xpath("//span[text()=\"Practice Form\"]")).click();

        // TODO - verify that you got the right link after you clicked

        System.out.println(driver.getCurrentUrl());

        // TODO - close the driver

        driver.close();
    }
}
