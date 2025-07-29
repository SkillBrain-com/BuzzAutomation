package homework.SamuelH.SeleniumTestNg.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumcomplet.TestPages;

public class BasicWebPageExample {

    public static void main(String[] args) {
        testBasicWebPage();

    }

    public static void testBasicWebPage() {
        ChromeDriver driver = TestPages.createChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.eviltester.com/styled/basic-web-page-test.html");

        WebElement aParagraphOfText = driver.findElement(By.cssSelector("#para1"));
        System.out.println(aParagraphOfText.getText());
        WebElement anotherParagraphOfText = driver.findElement(By.cssSelector("#para2"));
        System.out.println(anotherParagraphOfText.getText());
        WebElement page = driver.findElement(By.cssSelector("div[class='app-navigation'] a:nth-child(1)"));
        System.out.println(page.getText());
        driver.findElement(By.cssSelector("a[href='index.html']")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
//
//    public static void testBasicWebPage() {
//        ChromeDriver driver = TestPages.createChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demoqa.com/elements");
//        WebElement headerRight = driver.findElement(By.className("header-right"));
//        WebElement element = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
//        element.click();
//        System.out.println(headerRight.getText());
//        driver.findElement(By.id("userName")).sendKeys("Sam Jarda");
//        driver.findElement(By.id("email")).sendKeys("sam.jarda@email.com");
//        driver.findElement(By.id("currentAddress")).sendKeys("Strada Libertății 10, București");
//        driver.findElement(By.id("permanentAddress")).sendKeys("Strada Independenței 99, Cluj-Napoca");
//
//        String name = driver.findElement(By.id("name")).getText();
//        String email = driver.findElement(By.id("email")).getText();
//        String currentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
//        String permanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
//        submitButton.click();
//
//        submitButton = driver.findElement(By.id("submit"));
//        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
//        submitButton.click();
//
//
//        System.out.println("== Date afișate după Submit ==");
//        System.out.println(name);
//        System.out.println(email);
//        System.out.println(currentAddress);
//        System.out.println(permanentAddress);
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//
//        }
//        driver.quit();
//    }
//}
//        public static void testBasicWebPage() {
//        ChromeDriver driver = TestPages.createChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testpages.eviltester.com/styled/index.html");
//        WebElement alertTest = driver.findElement(By.cssSelector("#alerttest"));
//        driver.findElement(By.cssSelector("#alerttest")).click();
//
//            WebElement showAlertBox = driver.findElement(By.xpath("//*[@id='alertexamples']"));
//            showAlertBox.click();
//            Alert alert = driver.switchTo().alert();
//
//            String alertText = alert.getText();
//            System.out.println("Textul alertei: " + alertText);
//            alert.accept();
//            driver.switchTo().defaultContent();
//
//            WebElement showConfirmBox = driver.findElement(By.xpath("//*[@id='confirmexample']"));
//            showConfirmBox.click();
//            alertText = alert.getText();
//            System.out.println("Textul alertei: " + alertText);
//            alert.accept();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//                driver.quit();

//    }
//            }
