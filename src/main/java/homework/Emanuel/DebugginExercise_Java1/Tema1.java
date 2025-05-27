package homework.Emanuel.DebugginExercise_Java1;

import java.util.Scanner;

public class Tema1 {

    public static void main(String[] args) {
//
//        Exercitiu1();
//        Exercitiu2();
//        Exercitiu3();
//        Exercitiu4();
//        Exercitiu5();
//        Exercitiu6();
//        Exercitiu7();
//        Exercitiu8();

    }

    public static void Exercitiu1(){
        System.out.println("Imi place java!");
    }

    public static void Exercitiu2(){
        for(int i = 1; i<=6; i++){;
        System.out.println("Cursul acesta este fain!");}
    }

    public static void Exercitiu3(){
        int Ana = 24;
        int david = Ana-6;
        System.out.println(david);
    }

    public static void  Exercitiu4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti o noua propozitie in tastatura");
        String text = scanner.nextLine();
        System.out.println("Textul introdus este:" + text);
    }

    public static void Exercitiu5(){
        int varsta = 24;
        String nume = "Istrate Emanuel";
        boolean boolea = true;
        System.out.println(varsta);
        System.out.println(nume.toUpperCase());
        System.out.println(boolea);
    }

    public static void Exercitiu6(){
        Scanner myMethod = new Scanner(System.in);
        System.out.println("Afisati primul numar");
        int myINT = myMethod.nextInt();
        System.out.println("Primul numar intreg:" + myINT);
        System.out.println("Afisati al doilea numar");
        double myDouble = myMethod.nextDouble();
        System.out.println("Al doilea numar:" + myDouble);
    }

    public static void Exercitiu7(){
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Primul numar");
        double mydouble = myscanner.nextDouble();
        System.out.println(mydouble + 5);
        System.out.println(mydouble - 12.3);
        System.out.println(mydouble *(-2.3) );
        System.out.println(mydouble / 4);
        System.out.println(mydouble % 6);
    }

    public static void Exercitiu8(){
        int x = 2;
        int y = 12;


        // y = x * y
        // y = x + y


//        x = y - x;
//        y = y - x;


        System.out.println(x);
        System.out.println(y);
    }
}
