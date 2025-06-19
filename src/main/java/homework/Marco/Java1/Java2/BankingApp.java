package Java2;

import java.util.ArrayList;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object object = new Object();


        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(4);
        myList.add(10);
        myList.add(20);

        System.out.println("myList size =" + myList.size());

        myList.add(30);
        myList.add(50);
        myList.add(99);

        System.out.println("mylist size =" + myList.size());
        myList.remove(1);
        myList.remove(4);
        System.out.println(myList);
        myList.add(1, 15);


        System.out.println(myList);
    }
}
