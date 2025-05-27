package homework.Emanuel.HomeWorkPartea2_Java2;

import java.util.Arrays;

public class Exercitiul9Pt2 {

    public static void main(String[] args) {

        /*
        9. Definiti o metoda care ia un array de numere (intregi sau cu virgula) si
         sa-l ordoneze crescator sau descrescator.
         */

        int[] numere = {12, 7, 10, 45, 20, 15, 34, 64};

        System.out.println(Arrays.toString(numere));

        for(int sort = numere.length-1; sort > 0; sort--){
            for (int i = 0; i < sort; i++) {
                if(numere[i] > numere[i+1]){
                    int temp = numere[i];
                    numere[i] = numere[i+1];
                    numere[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numere));
    }
}
