package homework.Emanuel.HomeWorkPartea2_Java2;

public class Exercitiul5Pt2 {
    public static void main(String[] args) {

        /*
        1. Definiti un array de double, cu valori zecimale.
        Iterati array-ul folosind strutura for, si daca un element este egal cu valoarea 4.5,
        afisati-l pe ecran.
        Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”
         */
        double[] nrDouble = {2.2, 3.3, 1.6, 4.5, 5.5};
        System.out.println("==========================" + "Metoda 1");
        for (int i = 0; i < nrDouble.length; i++) {
            i = 0;

            if (nrDouble[i + 3] == 4.5) {
                System.out.println("Rezultatul este: " + nrDouble[i + 3]);
            }
            if (nrDouble[i + 4] > 5) {
                System.out.println("Elementul " + nrDouble[i + 4] + " este peste " + 5);
            }
            break;
        }
        System.out.println("==========================" + "Metoda 2");
        Metoda2();
        System.out.println("==========================" + "Metoda 3");
        Metoda3();
    }

    //=>Metoda 2
    public static void Metoda2() {
        double[] nrDouble = {2.2, 3.3, 1.6, 4.5, 5.5};

        double numeral = 4.5;
        nrDouble[3] = numeral;
        System.out.println(numeral);
        for (double numar2 : nrDouble) {
            int comparare = 5;
            if (numar2 > comparare) {
                System.out.println("Numarul dupa indexul [4], care este egal cu " + nrDouble[4] +
                        " este mai mare decat numarul " + comparare + ".");
            }
        }
    }

    //=>Metoda 3
    public static void Metoda3() {
        double[] nrDouble = {2.2, 3.3, 1.6, 4.5, 5.5};
        for (Double numere : nrDouble) {
            if (numere.equals(nrDouble[3])) {
                System.out.println("Metoda trei: " + numere);
            }
        }
    }
}
