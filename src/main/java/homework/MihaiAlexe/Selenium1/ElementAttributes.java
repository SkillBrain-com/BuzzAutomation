package homework.MihaiAlexe.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributes {
    public static void main(String[] args) {
        ChromeDriver driver = createDriverAndGetPage();
        getDetails(driver);
        tipuriAtribute(driver);
        addAnotherAttribute(driver);
        dynamicAttributes(driver);
        //driver.quit();
    }

    public static ChromeDriver createDriverAndGetPage() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/attributes-test.html");
        return driver;
    }

    public static void getDetails(ChromeDriver driver) {
        WebElement title = driver.findElement(By.xpath("//h1 [text() = 'Element Attributes Examples']"));
        System.out.println("Titlul este: " + title.getText());
    }

    public static void tipuriAtribute(ChromeDriver driver) {
        WebElement paragraph = driver.findElement(By.id("domattributes"));
        System.out.println("Textul din primul paragraf: " + paragraph.getText());
        System.out.println("");
        System.out.println("Afisam tipuri de atribute: ");
        String idAttr = paragraph.getDomAttribute("id");
        String customAttr = paragraph.getAttribute("custom-attrib");
        String classAttr = paragraph.getDomAttribute("class");
        String titleAttr = paragraph.getDomAttribute("title");
        String originalTitleAttr = paragraph.getDomAttribute("original-title");
        System.out.println("id = " + idAttr);
        System.out.println("class = " + classAttr);
        System.out.println("custom-attrib = " + customAttr);
        System.out.println("title = " + titleAttr);
        System.out.println("original-title = " + originalTitleAttr);
        System.out.println("");

    }

    public static void addAnotherAttribute(ChromeDriver driver) {
        System.out.println("Testam adaugarea de atribute cand dam click: ");
        WebElement addAttributeLink = driver.findElement(By.xpath("//button[text()='Add Another Attribute']"));
        addAttributeLink.click();
        WebElement p = driver.findElement(By.id("jsattributes"));
        String nextId = p.getDomAttribute("nextid");
        String newAttrName = "custom-" + nextId;
        System.out.println("A fost adaugat atributul: " + newAttrName);
        System.out.println("");

    }

    public static void dynamicAttributes(ChromeDriver driver) {
        System.out.println("Testam Auto Dynamically Updating Attributes: ");
        try {
            WebElement paragraph = driver.findElement(By.id("jsautoattributes"));
            String valoareInitiala = paragraph.getDomAttribute("data-count");
            Thread.sleep(5000);
            String valoareNoua = paragraph.getDomAttribute("data-count");
            System.out.println("Valoare inițială: " + valoareInitiala);
            System.out.println("Valoare după 3 secunde: " + valoareNoua);
            System.out.println("S-a schimbat? " + (!valoareInitiala.equals(valoareNoua)));
        } catch (InterruptedException e) {
            System.out.println("Eroare la sleep: " + e.getMessage());
        }
    }
}
