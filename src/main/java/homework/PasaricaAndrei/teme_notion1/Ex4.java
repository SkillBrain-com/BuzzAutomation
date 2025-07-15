package homework.PasaricaAndrei.teme_notion1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți o propoziție: ");
        String propozitie = scanner.nextLine();
        System.out.println("Ați introdus: " + propozitie);
        scanner.close();
    }
}

