package homework.andreiB.exercitii.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numere {
    public static void main(String[] args) {
        List<Integer> numere = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            numere.add(scanner.nextInt());
        }
        System.out.println("Lista este" + " " + numere);


    }
}
