package homework.andreiB.homework.selenium1.AfisareText;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AfisareTextPag3 {

    public static void afiseazaTextDacaExista(WebElement element, String descriere) {
        String text = element.getText().trim();
        if (!text.isEmpty()) {
            System.out.println(descriere + " → " + text);
        }
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/find-by-playground-test.html");

        Pagina3 pagina3 = new Pagina3(driver);


        afiseazaTextDacaExista(pagina3.toateParagrafele, "Acestea sunt paragrafele si link-urile");
        afiseazaTextDacaExista(pagina3.subTitlu, "Acesta este subtitlu");
        afiseazaTextDacaExista(pagina3.titlu, "Acesta este titlu");

        driver.quit();


    }
}
