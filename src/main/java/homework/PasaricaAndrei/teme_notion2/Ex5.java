package homework.PasaricaAndrei.teme_notion2;

public class Ex5 {
    public static void main(String[] args) {

        double[] valori = {3.2, 4.5, 6.1, 2.8,4.5, 5.0, 7.3, 4.5};

        for (int i = 0; i < valori.length; i++) {
            if (valori[i] == 4.5) {
                System.out.println("Numar 4.5 " + valori[i]);
            }
            if (valori[i] > 5) {
                System.out.println("Numar peste 5 " + valori[i]);
            }
        }
    }
}
