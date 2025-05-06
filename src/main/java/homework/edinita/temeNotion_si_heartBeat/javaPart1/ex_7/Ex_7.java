package homework.edinita.temeNotion_si_heartBeat.javaPart1.ex_7;

import java.util.Scanner;

/*
7. Scrieti un program in care cititi de la tastatura un numar, si calculati:

- rezultatul sumei cu 5
- rezultatul scaderii cu 12.3
- rezultatul inmultirii cu -3.2
- rezultatul impartirii cu 4
- rezultatul modulului cu 6

 */

public class Ex_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrie de la tastatura numarul magic!");
        double magic = scanner.nextInt();


        System.out.println("acum stii ca........");


        double sum = magic + 5;
        System.out.println("rezultatul sumei cu 5 este : " + sum);

        double dif = magic - 12.3;
        System.out.println("rezultatul scaderii cu 12.3 este : " + dif);

        double ori = magic * -3.2;
        System.out.println("rezultatul inmultirii cu -3.2 este : " + ori);

        double pe = magic / 4;
        System.out.println("rezultatul impartirii cu 4 este : " + pe);

        double mod = magic % 6;
        System.out.println("rezultatul modulului cu 6 este : " + mod);
    }
}
