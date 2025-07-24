package homework.andreiB.homework.homework1;
import java.util.Scanner;
public class Tema7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu un număr: ");
            double numar = scanner.nextDouble();

            System.out.println("Număr + 5 = " + (numar + 5));
            System.out.println("Număr - 12.3 = " + (numar - 12.3));
            System.out.println("Număr * (-3.2) = " + (numar * -3.2));
            System.out.println("Număr / 4 = " + (numar / 4));
            System.out.println("Număr % 6 = " + (numar % 6));
        }

}
