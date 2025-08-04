package homework.Marco.Java2;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection {
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

    public static class Lasagna {
        public static int expectedMinutesInOven() {
            return 40;
        }

        public static int remainingMinutesInOven(int actualMinutesInOven){
            return expectedMinutesInOven() - actualMinutesInOven;
        }

        public static int preparationTimeInMinutes(int layers) {
            return layers * 2;
        }

        public static int totalTimeInMinutes(int layers , int actualMinutesInOven) {
            return preparationTimeInMinutes(layers) + actualMinutesInOven;
        }

        public static void main(String[] args) {

            System.out.println("Expected Time in oven : " + expectedMinutesInOven() + " minutes.");
            System.out.println("Remaining time in oven : " + remainingMinutesInOven(30) + " minutes");
            System.out.println("The preparation time in minutes is: " + preparationTimeInMinutes(2) + " for 2 layers.");
            System.out.println("The total time in minutes is:" + totalTimeInMinutes(2,30));
        }
    }
}
