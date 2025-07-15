package homework.PasaricaAndrei.teme_notion2;

public class Ex3 {
    public static void main(String[] args) {

        int[][] matrice = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        for (int i = 0; i < matrice.length; i++) {
            int primul = matrice[i][0];
            int ultimul = matrice[i][matrice[i].length - 1];
            System.out.println("Rândul " + i + " primul " + primul + " ultimul " + ultimul);
        }
    }
}
