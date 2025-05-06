package homework.MihaiAlexe;

import java.util.Scanner;

public class JavaBasics1 {

    public static void main(String[] args) {
        //Exercitiul1();
        //Exercitiul2();
        //Exercitiul3();
        //Exercitiul4();
        //myVariables();
        //Exercitiul6();
        //Exercitiul7();
        //Exercitiul8();

    }

    //Exercitiul 1: Scrieti un program care afiseaza “Imi place Java”
    public static void Exercitiul1() {
        System.out.println("Imi place Java");
    }

    // Exercitiul 2: Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”
    public static void Exercitiul2() {
        int a = 0;
        while (a < 6) {
            System.out.println("Cursul acesta este foarte fain!");
            a++;
        }
    }

    // Exercitiul 3:Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
    public static void Exercitiul3() {
        int varstaAna = 24;
        int varstaDavid = (varstaAna - 6);
        System.out.println(varstaDavid);
    }

    // Exercitiul 4: Scrieti un program in care cititi o propozitie de la tastatura
    public static void Exercitiul4() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter integer");
        int myInt = myScanner.nextInt();
        System.out.println("Integer number is: " + myInt);
        System.out.println("Please enter double number");
        double myDouble = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.println("Double number is: " + myDouble);
        System.out.println("Please enter a string");
        String myString = myScanner.nextLine();
        System.out.println("String is: " + myString);

    }
    // Exercitiul 5: Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un
    //String si un boolean, apoi apelati metoda din metoda “main”

    public static void myVariables() {
        int Variable1 = 10;
        String Variable2 = "Nota primita este: ";
        boolean Variable3 = true;
        System.out.println(Variable2 + Variable1 + " " + Variable3);

    }
    // Exercitiul 6: Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le
    //stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.

    public static void Exercitiul6() {
        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("Prima variabila: ");
        int myInt2 = myScanner2.nextInt();
        System.out.println("A doua variabila: ");
        int myInt3 = myScanner2.nextInt();
        System.out.println("Variabilele introduse sunt: " + myInt2 + " " + "si" + " " + myInt3);
        myScanner2.close();

    }

    // Exercitiul 7: Scrieti un program in care cititi de la tastatura un numar, si calculati:
    // - rezultatul sumei cu 5
    // - rezultatul scaderii cu 12.3
    // - rezultatul inmultirii cu -3.2
    // - rezultatul impartirii cu 4
    // - rezultatul modulului cu 6

    public static void Exercitiul7() {
        Scanner myScanner3 = new Scanner(System.in);
        System.out.println("Numarul de la care pornim este: ");
        double myNum = myScanner3.nextDouble();
        System.out.println("Rezultatul sumei cu 5 este: " + (myNum + 5));
        System.out.println("Rezultatul scaderii cu 12.3 este: " + (myNum - 12.3));
        System.out.println("Rezultatul inmultirii cu -3.2 este: " + (myNum * -3.2));
        System.out.println("Rezultatul impartirii cu 4 este: " + (myNum / 4));
        System.out.println("REzultatul modulului cu 6 este: " + (myNum % 6));
        myScanner3.close();
    }

    //Exercitiul 8: Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa
    //fie 12 si 2:
    public static void Exercitiul8() {

        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y; // Am decomentat această linie

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);

    }

}



