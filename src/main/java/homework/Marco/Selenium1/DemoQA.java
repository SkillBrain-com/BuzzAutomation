package homework.Marco.Selenium1;

import driver.WebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.nio.file.WatchEvent;

public class DemoQA {

    public static void main(String[] args) {
        ChromeDriver driver = WebdriverManager.createChromeDriver();
        //textBox(driver);
        //checkBox(driver);
        //radioButton(driver);
        //webtables(driver);
        //buttons(driver);
        //links(driver);
    }

    public static void textBox(ChromeDriver driver) {
        driver.get("https://demoqa.com/text-box");

        //FullName box
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Marco Rabita");

        //Email
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("test@test.com");

        //CurrentAddress
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Romania, Drobeta-Turnu-Severin");

        //PermanentAddress
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Romania, Drobeta-Turnu-Severin");

        //SubmitButton
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        //Border
        WebElement border = driver.findElement(By.cssSelector(".border"));
        System.out.println(border.getText());

        driver.quit();
    }

    public static void checkBox(ChromeDriver driver) {
        driver.get("https://demoqa.com/checkbox");

        //aria-label button
        WebElement labelButton = driver.findElement(By.cssSelector(".rct-text button"));
        labelButton.click();

        //home option label
        WebElement homeLabel = driver.findElement(By.cssSelector("label[for=\"tree-node-home\"]"));
        homeLabel.click();

        //Resulted text
        WebElement resultedText = driver.findElement(By.id("result"));
        System.out.print(resultedText.getText());


        driver.quit();
    }

    public static void radioButton(ChromeDriver driver) {
        driver.get("https://demoqa.com/radio-button");

        //Text
        WebElement text = driver.findElement(By.cssSelector(".mb-3"));
        System.out.println(text.getText());

        //Yes button option
        WebElement yesButton = driver.findElement(By.id("yesRadio"));

        //No button option
        WebElement noButton = driver.findElement(By.id("noRadio"));

        //Impressive button option
        WebElement impressiveButton = driver.findElement(By.id("impressiveRadio"));
        //impressiveButton.click();

        driver.executeScript("arguments[0].click()", yesButton);

        driver.quit();

    }

    public static void webtables(ChromeDriver driver) {
        driver.get("https://demoqa.com/webtables");

        //add button
        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        //First name
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Marco");

        //Last name
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Rabita");

        //email
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("test@test.com");

        //age
        WebElement age = driver.findElement(By.id("age"));
        age.sendKeys("16");

        //salary
        WebElement salary = driver.findElement(By.id("salary"));
        salary.sendKeys("3000");

        //department
        WebElement department = driver.findElement(By.id("department"));
        department.sendKeys("Tester");

        //submit button
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        driver.quit();
    }

    public static void buttons(ChromeDriver driver) {
        driver.get("https://demoqa.com/buttons");

        //doubleclick me button
        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButton).perform();

        //double click text
        WebElement doubleClicktext = driver.findElement(By.id("doubleClickMessage"));
        System.out.println(doubleClicktext.getText());

        //rightclick me button
        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickButton).perform();

        //rightclick text
        WebElement rightClickText = driver.findElement(By.id("rightClickMessage"));
        System.out.println(rightClickText.getText());

        //click me
        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickButton.click();

        //click text
        WebElement clickText = driver.findElement(By.id("dynamicClickMessage"));
        System.out.println(clickText.getText());


        driver.quit();
    }

    public static void links(ChromeDriver driver) {
        driver.get("https://demoqa.com/links");

        //first text
        WebElement firstText = driver.findElement(By.xpath("//strong[text()='Following links will open new tab']"));
        System.out.println(firstText.getText());
        System.out.println("");

        //first and second home link
        WebElement firstHomeLink = driver.findElement(By.id("simpleLink"));
        System.out.println(firstHomeLink.getText());
        WebElement secondHomeLink = driver.findElement(By.id("dynamicLink"));
        System.out.println(secondHomeLink.getText());
        System.out.println("");

        //second text
        WebElement secondText = driver.findElement(By.xpath("//strong[text()='Following links will send an api call']"));
        System.out.println(secondText.getText());
        System.out.println("");

        //api links
        WebElement createdLink = driver.findElement(By.id("created"));
        System.out.println(createdLink.getText());

        WebElement noContent = driver.findElement(By.id("no-content"));
        System.out.println(noContent.getText());

        WebElement movedLink = driver.findElement(By.id("moved"));
        System.out.println(movedLink.getText());

        WebElement badRequestLink = driver.findElement(By.id("bad-request"));
        System.out.println(badRequestLink.getText());

        WebElement unauthorizedLink = driver.findElement(By.id("unauthorized"));
        System.out.println(unauthorizedLink.getText());

        WebElement forbiddenLink = driver.findElement(By.id("forbidden"));
        System.out.println(forbiddenLink.getText());

        WebElement notFounfLink = driver.findElement(By.id("invalid-url"));
        System.out.println(notFounfLink.getText());



        driver.quit();
    }

}
