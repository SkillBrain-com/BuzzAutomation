package Java1;

import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu primul numar:");
        int numar1 = scanner.nextInt();

        System.out.println("Introdu ai doilea numar:");
        int numar2 = scanner.nextInt();

        System.out.println("Numerele introduse sunt: " + numar1 + " si " + numar2);
        scanner.close();
    }
}
