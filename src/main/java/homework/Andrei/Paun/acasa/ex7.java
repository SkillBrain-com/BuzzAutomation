package homework.Andrei.Paun.acasa;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        calculeaza();
    }

    public static void calculeaza() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        double numar = scanner.nextDouble();

        System.out.println("Rezultatul sumei cu 5: " + (numar + 5));
        System.out.println("Rezultatul scaderii cu 12.3: " + (numar - 12.3));
        System.out.println("Rezultatul inmultirii cu -3.2: " + (numar * -3.2));
        System.out.println("Rezultatul impartirii cu 4: " + (numar / 4));
        System.out.println("Rezultatul modulului cu 6: " + (numar % 6));

        scanner.close();
    }
}
