package homework.edinita.demoSelenium1.tests;

import demoSelenium1.driver.SetupWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTablesTests {
    public static ChromeDriver createDriverAndGetPage() {
        ChromeDriver driver = SetupWebDriver.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
        return driver;
    }

    public static void getTableDetails(ChromeDriver driver) {
        WebElement tableCaption = driver.findElement(By.cssSelector("#tablehere table caption"));
        System.out.println("CAPTION: " + tableCaption.getText());
        WebElement table = driver.findElement(By.cssSelector("#tablehere table"));
        System.out.println("ID Attribute: " +table.getAttribute("id"));
        System.out.println("");

        // select table rows and columns
        List<WebElement> tableRows = driver.findElements(By.cssSelector("#tablehere table tr"));
        for (int i = 0; i < tableRows.size(); i++) {
            WebElement currentRow = tableRows.get(i);
            if (i == 0) {
                WebElement firstRow = tableRows.get(0);
                List<WebElement> firstRowColums = currentRow.findElements(By.cssSelector("th"));
                System.out.println("HEADER DIN PRIMA COLOANA: " + firstRowColums.get(0).getText());
                System.out.println("HEADER DIN A DOUA COLOANA: " + firstRowColums.get(1).getText());
                System.out.println("");
            } else {
                List<WebElement> currentColums = currentRow.findElements(By.cssSelector("td"));
                System.out.println("Text din randul " + (i + 1) + ", coloana 1: " + currentColums.get(0).getText());
                System.out.println("Text din randul " + (i + 1) + ", coloana 2: " + currentColums.get(1).getText());
            }
        }
    }
    public static void updateTable (ChromeDriver driver){
        WebElement summary = driver.findElement(By.cssSelector("details summary"));
        summary.click();

        //update caption
        WebElement caption = driver.findElement(By.id("caption"));
        caption.clear();
        caption.sendKeys("TABELA DYNAMICA");

        //update table id
        WebElement tableId = driver.findElement(By.id("tableid"));
        tableId.clear();
        tableId.sendKeys("customId");

        //udpate table content
        WebElement jsonDate = driver.findElement(By.cssSelector("textarea#jsondata"));
        jsonDate.clear();
        jsonDate.sendKeys("{ \"name\": \"John\", \"age\": 30, \"city\": \"New York\" }");
        System.out.println(jsonDate.getAttribute("value"));

        //press refresh button
        WebElement refreshTableButton = driver.findElement(By.id("refreshtable"));
        refreshTableButton.click();


        WebElement table = driver.findElement(By.cssSelector("#tablehere table"));
        System.out.println(table.getAttribute("id"));
    }

    public static void main(String[] args) {
        ChromeDriver driver = createDriverAndGetPage();

        getTableDetails(driver);
        updateTable(driver);
        getTableDetails(driver);

        driver.quit();
    }
}
