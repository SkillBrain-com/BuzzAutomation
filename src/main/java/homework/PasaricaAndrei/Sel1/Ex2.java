package homework.PasaricaAndrei.Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/elements");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // TEXT BOX
        driver.findElement(By.xpath("//span[text()='Text Box']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("userName")).sendKeys("Nume Test");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("email@test.com");
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Adresa curentă");
        driver.findElement(By.cssSelector("textarea#permanentAddress")).sendKeys("Adresa permanentă");
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(1000);


        // CHECK BOX
        driver.findElement(By.xpath("//span[text()='Check Box']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[title='Expand all']")).click();
        Thread.sleep(1000);
        List<WebElement> checkboxes = driver.findElements(By.cssSelector(".rct-checkbox"));
        for (WebElement cb : checkboxes) {
            cb.click();
            Thread.sleep(200);
        }


        // RADIO BUTTON
        driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("label[for='impressiveRadio']")).click();
        Thread.sleep(500);


        // WEB TABLES
        driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("addNewRecordButton")).click();
        Thread.sleep(500);
        driver.findElement(By.id("firstName")).sendKeys("Ion");
        driver.findElement(By.id("lastName")).sendKeys("Popescu");
        driver.findElement(By.id("userEmail")).sendKeys("ion.popescu@email.com");
        driver.findElement(By.id("age")).sendKeys("30");
        driver.findElement(By.id("salary")).sendKeys("5000");
        driver.findElement(By.id("department")).sendKeys("IT");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(1000);

        // Extrage datele din tabel
        List<WebElement> cells = driver.findElements(By.cssSelector(".rt-td"));
        System.out.println("=== Date din tabel ===");
        for (WebElement cell : cells) {
            System.out.println(cell.getText());
        }


        // LINKS
        driver.findElement(By.xpath("//span[text()='Links']")).click();
        Thread.sleep(1000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("=== Linkuri găsite ===");
        for (WebElement link : links) {
            System.out.println(link.getText() + " -> " + link.getAttribute("href"));
        }

        // Exemplu de click pe un link valid
        WebElement linkValid = driver.findElement(By.id("simpleLink"));
        linkValid.click();
        Thread.sleep(3000);

        driver.quit();
    }
}

