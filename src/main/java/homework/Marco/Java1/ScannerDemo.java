package Java1;

import java.util.Scanner;

public class ScannerDemo {


    public static void main(String[] args) {

        //Object Oriented Programming  (OOP)
        //PO (Programare pe Obiecte)
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter integer");
        int myInt = myScanner.nextInt();

        System.out.println("Integer number is: " + myInt);

        System.out.println("Please enter double number");
        double myDouble = myScanner.nextDouble();
        myScanner.nextLine();

        System.out.println("Double number is:" + myDouble);

        System.out.println("Please enter a string");
        String myString = myScanner.nextLine();

        System.out.println("String is:" + myString);



    }
}
