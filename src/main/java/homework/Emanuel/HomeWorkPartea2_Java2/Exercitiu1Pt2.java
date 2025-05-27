package homework.Emanuel.HomeWorkPartea2_Java2;

import java.util.Random;
import java.util.Scanner;

public class Exercitiu1Pt2 {

    public static void main(String[] args) {

        /*
         1.  Citit un numar de la tastatura si stocati valoarea lui intr-o variabila. Generati un numar random
             intre 1 si 100 si stocati acel numar intr-o alta variabila.
             Daca numarul introdus de la tastatura este mai mic decat numarul random generat,
             afisati mesajul “Numarul introdus este mai mic decat <numar_random>”
             (inserati valoarea numarului random generat in textul afisat).
             */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Rezolvarea!");
        System.out.println("!======================!");
        System.out.println("Ex1: Introdu un numar de la tastatura:");

        int Maxim = 100;
        int Minim = 1;

        int nrRendomMax = random.nextInt(Maxim);
        int nrRendomMini =  random.nextInt(Minim);

            int nrTastatura = scanner.nextInt();
            System.out.println("Numarul de la tastatura este: " + nrTastatura);
            if(nrTastatura < nrRendomMax && nrTastatura > nrRendomMini ){
                System.out.println("Numarul de la tastatura  este mai mic ca numarul rendom generat: " + nrRendomMax);
            }else {
                System.out.println("Numarul de la tastatura este mai mare decat numarul rendom generat " + nrRendomMini);
            }
    }
}

