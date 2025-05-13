package homework.edinita.javaPart1.ex_6;

/*
6. Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le
stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.
 */

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Phrase();
    }

    public static void Phrase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the first number you want to print!");
        int firstNumber = scanner.nextInt();
        System.out.println("Write the second number now!");
        int secondNumber = scanner.nextInt();
        System.out.println("Where are the 2 numbers.... First one : " + firstNumber + " and the second one : " + secondNumber);
    }
}
