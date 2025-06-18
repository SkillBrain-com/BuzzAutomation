package homework.GabrielaDumitru.javabasics2;

import java.util.Scanner;

public class BankingApp {


    public static void main(String[] args) {
        boolean isBlocked = false;
        int retry = 3;
        int correctPin = 5060;
        Scanner scanner = new Scanner(System.in);

        while (retry > 0  && !scanner.next().equals("q")){
            System.out.println("Welcome to ATM!");
            System.out.println("Please enter PIN");
            int userPin = scanner.nextInt();
            if(userPin == correctPin) {
                System.out.println("Welcome your money is safe :)");
                break;
            } else {
                System.out.println("Wrong PIN, try again");
                retry --;
                System.out.println("Attemps to login left:" + retry);
            }
            if (retry == 0) {
                isBlocked = true;
            }
            if (isBlocked == true) {
                System.out.println("Your card was blocked, plese contact your bank");
                break;
            }
        }


    }
}
