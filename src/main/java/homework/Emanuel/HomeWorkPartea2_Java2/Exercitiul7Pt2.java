package homework.Emanuel.HomeWorkPartea2_Java2;

import java.util.ArrayList;

public class Exercitiul7Pt2 {

    public static void main(String[] args) {

        /*
        1. Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
         */
        ArrayList<Integer> obiecte = new ArrayList<>();
        obiecte.add(12);
        obiecte.add(24);
        obiecte.add(65);
        obiecte.add(3);
        obiecte.add(8);

        // [12, 24, 65, 3, 8]
        int suma = 0;
        int i = 0;
        do{
            suma += obiecte.get(i);
            i++;
        }while(i < obiecte.size());
        System.out.println("Suma egal cu: " + suma);
    }
}

