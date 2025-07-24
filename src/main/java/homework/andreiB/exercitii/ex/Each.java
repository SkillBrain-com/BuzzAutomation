package homework.andreiB.exercitii.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Each {

    public static void main(String[] args) {
        List<Integer> valori = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            valori.add(scanner.nextInt());
        }
        System.out.println("Valorile sunt" + " " + valori);
        valori.forEach(System.out::println);
    }

}


