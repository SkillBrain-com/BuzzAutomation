package homework.Andrei.Paun.employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Angajat {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Ana are mere");
        //System.out.println("Introdu de la tastatura:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valoarea de la tastatura: "+scanner.nextInt());
        File file = new File("C:\\Users\\PC\\Desktop\\Test.txt");
        Scanner scanner1 = new Scanner(file);
        System.out.println(scanner1.next());
        /*
        wer
        ert
        rtz
        tzu

         */
    }
}
