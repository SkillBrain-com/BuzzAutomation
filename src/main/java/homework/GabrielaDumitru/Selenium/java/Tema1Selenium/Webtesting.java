package homework.GabrielaDumitru.Selenium.java.Tema1Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtesting {
    public static void main(String[] args) {
        ChromeDriver driver = createDriverAndGetPage();
        locateElements(driver);
        testbutonJump(driver);


    }
    public static ChromeDriver createDriverAndGetPage() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/find-by-playground-test.html");
        return driver;
    }
    public static void locateElements(ChromeDriver driver) {
        WebElement aParagraph = driver.findElement(By.id("p1"));
        System.out.println("Paragraful a, localizat prin id, este: " + aParagraph.getText());
        WebElement aParagraph1 = driver.findElement(By.xpath("//p[@name ='pName1']"));
        System.out.println("Paragraful a, localizat prin Xpath, este: " + aParagraph1.getText());
        WebElement aParagraph2 = driver.findElement(By.name("pName1"));
        System.out.println("Paragraful a, localizat prin name, este: " + aParagraph2.getText());
        System.out.println("");
        WebElement rParagraph = driver.findElement(By.id("p18"));
        System.out.println("Paragraful r, localizat prin id, este: " + rParagraph.getText());
        WebElement rParagraph1 = driver.findElement(By.xpath("//p[@name ='pName18']"));
        System.out.println("Paragraful r, localizat prin Xpath, este: " + rParagraph1.getText());
        WebElement rParagraph2 = driver.findElement(By.name("pName18"));
        System.out.println("Paragraful r, localizat prin name, este: " + rParagraph2.getText());
        System.out.println("");
        WebElement nestedParagraph = driver.findElement(By.id("p26"));
        System.out.println("Primul nested para text, localizat prin id, este: " + nestedParagraph.getText());
        WebElement nestedParagraph1 = driver.findElement(By.xpath("//p[@name ='pName26']"));
        System.out.println("Primul nested para text, localizat prin Xpath, este: " + nestedParagraph1.getText());
        WebElement nestedParagraph2 = driver.findElement(By.name("pName26"));
        System.out.println("Primul nested para text, localizat prin name, este: " + nestedParagraph2.getText());
        System.out.println("");
    }
    public static void testbutonJump(ChromeDriver driver) {
        WebElement jumptoparaLink = driver.findElement(By.id("a26"));
        jumptoparaLink.click();
        System.out.println("Primul buton jump to para localizat prin id functioneaza si este: " + jumptoparaLink.getText());
        WebElement jumptoparaLink1 = driver.findElement(By.name("aName26"));
        jumptoparaLink1.click();
        System.out.println("Primul buton jump to para localizat prin name functioneaza si este: " + jumptoparaLink1.getText());
    }
}
