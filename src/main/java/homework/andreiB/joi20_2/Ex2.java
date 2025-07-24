package homework.andreiB.joi20_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {

    ArrayList<Integer> ani = new ArrayList<>();
     static List<String> masini = new ArrayList < > ();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        masini.add(String.valueOf(1995));


        Ex2 objesct1 = new Ex2();

        objesct1.ani.add(1997);
        objesct1.ani.add(1998);
        objesct1.ani.add(1542);
        objesct1.ani.add(1259);

        for (int i = 0;  i < objesct1.ani.size(); i++){
            System.out.println("Adauga un numar pentru verificare");
            int valCitita = scanner.nextInt();
            if (objesct1.ani.get(i) == valCitita) {
                System.out.println("Adauga un numar nou");
                objesct1.ani.set(i, scanner.nextInt());
                break;
            }

        }
        System.out.println(objesct1.ani);

    }

    }

