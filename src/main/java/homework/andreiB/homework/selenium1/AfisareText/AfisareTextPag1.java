package homework.andreiB.homework.selenium1.AfisareText;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AfisareTextPag1 {

    public static void afiseazaTextDacaExista(WebElement element,  String descriere) {
        String text = element.getText().trim();
        if (!text.isEmpty()) {
            System.out.println(descriere + " → " + text);
        }
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-web-page-test.html");

        Pagina1 pagina = new Pagina1(driver);

        System.out.println("....................................................Pagina1...........................................");


        afiseazaTextDacaExista(pagina.link1, "Link-ul 1 este:");
        afiseazaTextDacaExista(pagina.link2, "Link-ul 2 este:");
        afiseazaTextDacaExista(pagina.link3, "Link-ul 3 este");
        afiseazaTextDacaExista(pagina.title, "Titlul este");
        afiseazaTextDacaExista(pagina.subTitle, "Subtitlul este");
        afiseazaTextDacaExista(pagina.paragraph1, "Paragraful 1 este");
        afiseazaTextDacaExista(pagina.paragraph2, "Paragraful 2 este");
        afiseazaTextDacaExista(pagina.hyperLink1, "Hyperlink-ul 1 este");
        afiseazaTextDacaExista(pagina.hyperLink2, "Hyperlink-ul 2 este");


        driver.quit();
    }


}
