package homework.AndreiB.Homework.homework1;
import java.util.Scanner;
public class Tema6 {

    public static void main(String[] args) {
            citireNumere();
        }

        public static void citireNumere() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu primul număr: ");
            int a = scanner.nextInt();
            System.out.print("Introdu al doilea număr: ");
            int b = scanner.nextInt();

            System.out.println("Ai introdus: " + a + " și " + b);
        }

}
