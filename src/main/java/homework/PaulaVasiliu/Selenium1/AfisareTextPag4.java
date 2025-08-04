package homework.PaulaVasiliu.Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AfisareTextPag4 {


    public static void afiseazaTextDacaExista(WebElement element, String descriere) {
        String text = element.getText().trim();
        if (!text.isEmpty()) {
            System.out.println(descriere + " → " + text);
        }
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/webdriver-example-page");

        Pagina4 pagina4 = new Pagina4(driver);


        afiseazaTextDacaExista(pagina4.titlu, "Acesta este titlu");
        afiseazaTextDacaExista(pagina4.subtitlu, "Acesta este subtitlu");
        afiseazaTextDacaExista(pagina4.paragraf2, "Acesta este paragraful 2");
        afiseazaTextDacaExista(pagina4.paragraf3, "Acesta este paragraful 3");
        afiseazaTextDacaExista(pagina4.paragraf1, "Acesta este paragraful 1");
        afiseazaTextDacaExista(pagina4.item3, "Acesta este elementul 3");
        afiseazaTextDacaExista(pagina4.item2, "Acesta este elementul 2");
        afiseazaTextDacaExista(pagina4.item1, "Acesta este elementul 1");

        driver.quit();
    }



}
