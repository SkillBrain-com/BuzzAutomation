package homework.andreiB.homework.selenium1.AfisareText;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AfisareTextPag2 {



    public static void afiseazaTextDacaExista(WebElement element, String descriere) {
        String text = element.getText().trim();
        if (!text.isEmpty()) {
            System.out.println(descriere + " → " + text);
        }
    }




    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/attributes-test.html");

        Pagina2 pagina2 = new Pagina2(driver);


        System.out.println("....................................................Pagina2...........................................");
//
        afiseazaTextDacaExista(pagina2.title1, "Acesta este titlul");
        afiseazaTextDacaExista(pagina2.dynamicParagraph1, "Acesta este paragraful dinamic");
        afiseazaTextDacaExista(pagina2.paragraph2, "Acesta este paragraful 2");
        afiseazaTextDacaExista(pagina2.subTitle, "Acesta este subtitlu");
        afiseazaTextDacaExista(pagina2.nextIdButton, "Acesta este butonul");
        afiseazaTextDacaExista(pagina2.paragraph3, "Acesta este paragraful3");
        afiseazaTextDacaExista(pagina2.paragraph4, "Acesta este paragraful 4");
        afiseazaTextDacaExista(pagina2.subTitle2, "Acesta este subtitlul 2");
        afiseazaTextDacaExista(pagina2.title2, "Acesta este titlul 2");
        afiseazaTextDacaExista(pagina2.title3, "Acesta este titlul 3");
//      WebElement nextIdButton = driver.findElement(By.xpath("//h2[normalize-space()='Auto Dynamically Updating Attributes']"));
//        nextIdButton.click();

        driver.quit();

    }
}
