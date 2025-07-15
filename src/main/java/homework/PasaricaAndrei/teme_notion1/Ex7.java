package homework.PasaricaAndrei.teme_notion1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        double numar = scanner.nextDouble();

        double suma = numar + 5;
        double scadere = numar - 12.3;
        double inmultire = numar * -3.2;
        double impartire = numar / 4;
        double modul = numar % 6;

        System.out.println(suma);
        System.out.println(scadere);
        System.out.println(inmultire);
        System.out.println(impartire);
        System.out.println(modul);
        scanner.close(); // Închidem scannerul
    }
}

