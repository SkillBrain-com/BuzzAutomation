package homework.AndreiB.exercitii.exercitiiExtra;

import java.util.Scanner;

public class Par_Impar {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();

        System.out.println("Introduu numarul");


        if (numar % 2 == 0) {
            System.out.println("Numarul este par.");
        }
        if (numar % 2 != 0) {
        }   else {
            System.out.println("Numarul nu sete impar");
        }
        System.out.println(numar);



    }


}
