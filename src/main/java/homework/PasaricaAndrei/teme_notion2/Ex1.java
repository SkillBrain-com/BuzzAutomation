package homework.PasaricaAndrei.teme_notion2;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Scrie un nr");
        int numarIntrodus = scanner.nextInt();

        int numarRandom = random.nextInt(100) + 1;

        if (numarIntrodus < numarRandom) {
            System.out.println("Nr introdus este mai mic decat " + numarRandom);
        } else if (numarIntrodus > numarRandom) {
            System.out.println("Nr introdus este mai mare decat " + numarRandom);
        } else {
            System.out.println("Nr introdus este egal cu " + numarRandom);
        }
        scanner.close();
    }
}

