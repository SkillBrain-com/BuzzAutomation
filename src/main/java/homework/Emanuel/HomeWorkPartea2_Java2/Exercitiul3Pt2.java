package homework.Emanuel.HomeWorkPartea2_Java2;


public class Exercitiul3Pt2 {

    public static void main(String[] args) {
         /*
        Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente.
        Initializati array-ul.
         Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.
         */

        int[][] nrDimensiuni = {                  //int[][] nrDimensiuni = new int[5][6]
                {4, 6, 7, 8},
                {40, 60, 70, 80, 81}
        };
        System.out.print("[");
        System.out.print(nrDimensiuni[0][0] + ",");
        System.out.print(nrDimensiuni[1][0] + ",");
        System.out.print(nrDimensiuni[0][3] + ",");
        System.out.print(nrDimensiuni[1][4]);
        System.out.println("]");


//        System.out.print("[");
//        for(int i = 0; i < nrDimensiuni.length; i++){
//            for(int j = 0; j < nrDimensiuni[i].length; j++){
//
//
//
//                System.out.print(nrDimensiuni[1][0] + ",");
//            }
//        }
//        System.out.print("]");

    }
}
