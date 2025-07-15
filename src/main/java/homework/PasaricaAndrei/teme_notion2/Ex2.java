package homework.PasaricaAndrei.teme_notion2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Caracter (a/s/i/p/m)");
        char operatie = scanner.next().charAt(0);

        System.out.print("Primul numar ");
        double numar1 = scanner.nextDouble();

        System.out.print("Al doilea numar: ");
        double numar2 = scanner.nextDouble();

        switch (operatie) {
            case 'a':
                System.out.println("adunare" + (numar1 + numar2));
                break;
            case 's':
                System.out.println("scadere" + (numar1 - numar2));
                break;
            case 'i':
                System.out.println("inmultire" + (numar1 * numar2));
                break;
            case 'p':
                if (numar2 != 0) {
                    System.out.println("impartire" + (numar1 / numar2));
                } else {
                    System.out.println("eroare");
                }
                break;
            case 'm':
                System.out.println("modul" + (numar1 % numar2));
                break;
            default:
                System.out.println("eroare");
        }
        scanner.close();
    }
}

