package homework.SamuelH.Java1;

import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar");
        double numar = scanner.nextDouble();

        double suma = numar + 5;
        double scadere = numar - 12.3;
        double inmultire = numar * -3.2;
        double impartire = numar / 4;
        double modul = numar % 6;

        System.out.println("Suma cu 5: " + suma);
        System.out.println("Scaderea cu 12.3: " + scadere);
        System.out.println("Inmultirea cu -3.2: " + inmultire);
        System.out.println("Impartirea cu 4: " + impartire);
        System.out.println("Moduilul cu 6: " + modul);

        scanner.close();
    }
}
