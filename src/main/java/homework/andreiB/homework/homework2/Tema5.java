package homework.andreiB.homework.homework2;

public class Tema5 {

    public static void main(String[] args) {
        double[] valori = {2.3, 4.5, 6.1, 4.5, 7.2};

        for (double v : valori) {
            if (v == 4.5) {
                System.out.println("Valoare egală cu 4.5: " + v);
            }
            if (v > 5) {
                System.out.println("Element peste 5");
            }
        }
    }
}
