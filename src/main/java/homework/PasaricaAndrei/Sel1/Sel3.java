package homework.PasaricaAndrei.Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Sel3 {
        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("https://testpages.eviltester.com/styled/find-by-playground-test.html");

            List<WebElement> paragraphs = driver.findElements(By.tagName("p"));
            System.out.println("Paragrafe găsite:");
            for (WebElement paragraph : paragraphs) {
                System.out.println(" " + paragraph.getText());
            }

            List<WebElement> links = driver.findElements(By.tagName("a"));
            for (WebElement link : links) {
                String linkText = link.getText();
                System.out.println("Click pe link: " + linkText);
                try {
                    link.click();

                    driver.navigate().back();

                } catch (Exception e) {
                    System.out.println("Nu s-a putut da click pe " + linkText);
                }

                driver.quit();
            }
        }
}
