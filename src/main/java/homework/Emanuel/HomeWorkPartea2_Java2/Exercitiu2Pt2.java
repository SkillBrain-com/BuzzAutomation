package homework.Emanuel.HomeWorkPartea2_Java2;

import java.util.Scanner;

public class Exercitiu2Pt2 {

    public static void main(String[] args) {

        /*
        2).Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind structura switch,
        daca s-a introdus un caracter anume, realizati operatia
        respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
         -‘a’: adaugare  -‘s’: scadere  -‘i’: inmultire  -‘p’: impartire  -‘m’: modul
          Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
         */

        int nr1 = 2;
        int nr2 = 6;
        Scanner scanner1 = new Scanner(System.in);
        String OPERATII = scanner1.nextLine();

        switch(OPERATII){
            case"a":
                int rezultat = nr1 + nr2;
                System.out.println("Rezultatul adunari este: " + rezultat);
                break;
            case"s":
                int rezultat1 = nr1 - nr2;
                System.out.println("Rezultatul scaderi este: " + rezultat1);
                break;
            case"i":
                int rezultatul2 = nr1 * nr2;
                System.out.println("Rezultatul inmultiri este " + rezultatul2);
                break;
            case"p":
                int rezultatul3 = nr1 / nr2;
                System.out.println("Rezultatul impartiri este: " + rezultatul3);
            case"m":
                int rezultatul4 = nr1 * (nr1 - nr2) + nr2;
                System.out.println("Rezultatul mo   dulului este: " + rezultatul4);
                break;
            default:
                System.out.println("Sfarsitul operatiilor!!!");
        }
    }
}
