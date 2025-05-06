package Java1;

import java.util.Scanner;

public class JavaBasics1 {
    public static void main(String[] args) {

//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
//        myVariables();
//        exercise6();
//        exercise7();
//        exercise8();

        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();



    }





//exercitiul 1 - Scrieti un program care afiseaza “Imi place Java”


    static void exercise1() {
        System.out.println("Imi place Java");
    }





// exercitiul 2 - Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”


    static void exercise2() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Cursul acesta este foarte fain!");
        }
    }





/* exercitiul 3 - Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta
 lui David.*/


    static void exercise3() {

        int Ana = 24;
        int David = 6;
        int rezultatVarsta = Ana - David;
        String raspuns = "Varsta lui David este:";
        System.out.println(raspuns + rezultatVarsta);

    }





// exercitiul 4 - Scrieti un program in care cititi o propozitie de la tastatura


    static void exercise4() {
        String text = "Facem tema pentru joi";
        System.out.println(text);
    }





/*exercitiul 5 - Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un
String si un boolean, apoi apelati metoda din metoda “main”
*/


    static void myVariables() {
        int unu = 5;
        String skill = "Salutare prieteni!";
        boolean adevarat = 3>4;

        System.out.println(unu);
        System.out.println(skill);
        System.out.println(adevarat);


    }



/* exercitiul 6 - Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le
stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.*/


    static void exercise6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a number from your keyboard");
        System.out.println("Select a second number from your keyboard");

        int one = scanner.nextInt();

        System.out.println("Your first number is:" + one);

        double two = scanner.nextDouble();

        System.out.println("Your second number is:" + two);

    }




//exercitiul 7


    static void exercise7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a random number");

        double numereMulte = scanner.nextDouble();

        System.out.println(numereMulte + 5);
        System.out.println(numereMulte - 12.3);
        System.out.println(numereMulte * 3.2);
        System.out.println(numereMulte / 4);
        System.out.println(numereMulte % 6);

    }




    /*exercitiul 8 - Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa fie 12 si 2*/

    static void exercise8() {

        int x = 2;

        int y = 12;



        // y = x * y;

         y = x + y;



        x = y - x;

        y = y - x;



        System.out.println(x);

        System.out.println(y);
    }
}
