package homework.PasaricaAndrei.teme_notion1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        citesteSiAfiseazaNumere();
    }
    public static void citesteSiAfiseazaNumere() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        int numar1 = scanner.nextInt();

        System.out.print("Introduceti al doilea numar: ");
        int numar2 = scanner.nextInt();

        System.out.println("Ati introdus numerele: " + numar1 + " si " + numar2);
        scanner.close();
    }
}

