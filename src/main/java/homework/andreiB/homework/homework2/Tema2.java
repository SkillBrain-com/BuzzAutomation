package homework.andreiB.homework.homework2;
import java.util.Scanner;

public class Tema2 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introdu un caracter (a/s/i/p/m): ");
            char operatie = scanner.next().charAt(0);

            System.out.print("Introdu primul număr: ");
            int a = scanner.nextInt();

            System.out.print("Introdu al doilea număr: ");
            int b = scanner.nextInt();

            switch (operatie) {
                case 'a':
                    System.out.println("Adunare: " + (a + b));
                    break;
                case 's':
                    System.out.println("Scădere: " + (a - b));
                    break;
                case 'i':
                    System.out.println("Înmulțire: " + (a * b));
                    break;
                case 'p':
                    if (b != 0)
                        System.out.println("Împărțire: " + ((double)a / b));
                    else
                        System.out.println("Împărțire la 0!");
                    break;
                case 'm':
                    System.out.println("Modul: " + (a % b));
                    break;
                default:
                    System.out.println("Caracter invalid.");
            }
        }

}
