package homework.AndreiB.Homework.homework2;

public class Tema3 {


        public static void main(String[] args) {
            int[][] matrice = {
                    {1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 10},
                    {11, 12, 13, 14, 15}
            };

            for (int i = 0; i < matrice.length; i++) {
                System.out.println("Linia " + i + ": Primul = " + matrice[i][0] + ", Ultimul = " + matrice[i][matrice[i].length - 1]);
            }
        }

}
