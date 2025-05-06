package homework.Andrei.Paun.acasa;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int[] numere = citesteNumere();
        System.out.println("Numerele introduse sunt: " + numere[0] + " si " + numere[1]);
    }

    public static int[] citesteNumere() {
        Scanner scanner = new Scanner(System.in);
        int[] numere = new int[2];

        System.out.print("Introduceti primul numar: ");
        numere[0] = scanner.nextInt();

        System.out.print("Introduceti al doilea numar: ");
        numere[1] = scanner.nextInt();

        scanner.close();
        return numere;
    }
}
