package homework.PaulaVasiliu.javabascis2;

import java.util.ArrayList;
import java.util.Scanner;

public class Colection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myIntArray = new int[3];
//      diamond symbol
        Object object = new Object();

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(4); // 0
        myList.add(10); // 1
        myList.add(20); // 2 -> // 1

        System.out.println("myList size =" + myList.size());

        myList.add(30);  // 3 -> // 2
        myList.add(50); // 4 -> // 3
        myList.add(99); // 5 -> //4
        System.out.println("myList size =" + myList.size());
        System.out.println(myList);
        myList.remove(1);
        myList.remove(4);
        System.out.println("myList size =" + myList.size());
        System.out.println(myList);
        myList.add(1, 15);

        System.out.println(myList);




    }
}
