package homework.AndreiB.Homework.homework2;

import java.util.Arrays;
import java.util.List;

public class Tema7 {

    public static void main(String[] args) {
            List<Integer> lista = Arrays.asList(5, 10, 15, 20, 25);
            int suma = 0;

            for (int nr : lista) {
                suma += nr;
            }

            System.out.println("Suma elementelor: " + suma);
        }
}
