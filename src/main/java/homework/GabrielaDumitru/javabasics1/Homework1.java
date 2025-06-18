package homework.GabrielaDumitru.javabasics1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Exercises1();
        Exercises2();
        Exercises3();
        Exercises4();
        Exercises5();
        Exercises6();
        Exercises7();
        Exercises8();

        }


        //Exercises 1. Scrieti un program care afiseaza "Imi place Java".
        public static void Exercises1() {
            System.out.println("Imi place Java");
        }


        // Exercises 2. Scrieti un program care afiseaza de 6 ori propozitia "Cursul acesta este foarte fain!".
        public static void Exercises2() {
        int a = 0;
        while (a < 6) {
            System.out.println("Cursul acesta este foarte fain!");
            a++;
        }

        }


        // Exercises 3. Ana are 24 ani. Fratele ei David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
        public static void Exercises3() {
            int David = 24-6;
            System.out.println(David);
        }


        //Exercises 4. Scrieti un program in care cititi o propozitie de la tastatura.
         public static void Exercises4() {
             System.out.println("Introduceti primul numar:");
             Scanner scanner = new Scanner(System.in);
             double numar1 = scanner.nextDouble();
             System.out.println("Introduceti al doilea numar:");
             double numar2 = scanner.nextDouble();
         }


         // Exercises 5. Scrieti un program in care definiti 3 variabile in metoda "myVariables", un int, un String si un boolean, apoi apelati metoda "main".
         public static void Exercises5() {
         int myVariable1 = 25;
         String myVariable2 = "Nota primita este:";
         boolean myVariable3 = true;
             System.out.println(myVariable2 + myVariable1 + " " + myVariable3);
          }


         // Exercises 6. Scrieti un porgram in care creati o metoda unde cititi 2 numere de la tastatura, le stocati in variabile si dupa ce le-ati citit, afisati-le pe ecran.
          public static void Exercises6() {
          Scanner scanner1 = new Scanner(System.in);
              System.out.println("Introduceti prima variabila:");
              int nr1 = scanner1.nextInt();
              System.out.println("Introduceti a doua variabila");
              int nr2 = scanner1.nextInt();
              System.out.println("Cele doua variabile introduse sunt:" + nr1 + " "+ nr2);


          }


         // Exercises 7. Scrieti un program in care cititi de la tastatura un numar si calculati:
         // - rezultatul sumei cu 5
         // - rezultatul scaderii cu 12.3
         // - rezultatul inmultirii cu -3.2
         // - rezultatul impartirii cu 4
         // - rezulattul modulului cu 6

        public static void Exercises7() {
        int g = 20;
        System.out.println(g + 5);
        System.out.println(g - 12.3);
        System.out.println(g * -3.2);
        System.out.println(g / 4);
        System.out.println(g % 6);
        }


        // Exercises 8. Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa fie 12 si 2:
        public static void Exercises8() {
        int x = 2;
        int y = 12;

            // y=x * y;
            y =x + y;

            x = y - x;
            y = y - x;

            System.out.println(x);
            System.out.println(y);


        }

}
