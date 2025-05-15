package homework.AndreiB.joi20_2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {


        int[] ani = {1997, 1979, 2004, 1998};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Va rugam introduceti anul care trebuie inlocuit!!!!");

        int anulVechi = scanner.nextInt();
        System.out.println("Introduceti anul corect");

        int anulNou = scanner.nextInt();


        for (int i = 0; i < ani.length; i++) {
            if (ani[i] == anulVechi) {
                  ani[i] = anulNou;

            }
        }
        System.out.println(Arrays.toString(ani));
        
    }

}
