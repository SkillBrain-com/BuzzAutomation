package homework.MihaiAlexe.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebPage {

    public static void main(String[] args) {
        ChromeDriver driver = createDriverAndGetPage();
        getParagraphDetails(driver);
        getTitleDetails(driver);
        apasaButton(driver);
    }

    public static ChromeDriver createDriverAndGetPage() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-web-page-test.html");
        return driver;
    }


    public static void getParagraphDetails(ChromeDriver driver) {
        WebElement paragraphCaption = driver.findElement(By.tagName("p"));
        System.out.println("Continutul textului sub titlu este: " + paragraphCaption.getText());
        WebElement paragraphCaption3 = driver.findElement(By.id("para1"));
        System.out.println("Continutul primului paragraf: " + paragraphCaption3.getText());
        WebElement paragraphCaption4 = driver.findElement(By.id("para2"));
        System.out.println("Continutul celui de-al doilea paragraf: " + paragraphCaption4.getText());
    }


    public static void getTitleDetails (ChromeDriver driver) {
        WebElement title = driver.findElement(By.xpath("//h1 [text() = 'Basic Web Page Example']"));
        System.out.println("Titlul este: " + title.getText());
    }

    public static void apasaButton (ChromeDriver driver) {
        WebElement aboutLink = driver.findElement(By.xpath("//a[text() = 'About']"));
        aboutLink.click();
        WebElement indexLink = driver.findElement(By.xpath("//a[text() = 'Index']"));
        indexLink.click();
    }

}

