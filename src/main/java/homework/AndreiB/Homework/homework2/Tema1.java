package homework.AndreiB.Homework.homework2;
import java.util.Scanner;

public class Tema1 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu un număr: ");
            int numar = scanner.nextInt();

            int random = (int)(Math.random() * 100) + 1;

            if (numar < random) {
                System.out.println("Numărul introdus este mai mic decât " + random);
            } else {
                System.out.println("Numărul introdus NU este mai mic decât " + random);
            }

    }

}
