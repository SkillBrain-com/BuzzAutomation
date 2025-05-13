package homework.edinita.javaPart2.courses;

import java.util.Arrays;

public class JavaBasics2 {

    public static void main(String[] args) {

//        int[] arrays = {1, 3, 5, 7, 8, 10, 15, 23};

//        for (int i = 0; i < arrays.length; i++) {
//            System.out.println(arrays[i]);
//        }

        // FOREACH
//        for (int n : arrays) {
//            System.out.println(n);
//        }

        String[] names = {"Gabriela", "Ana Maria", "Monica", "Mihaela"};

        // iterate array - OK
        // find 'Ana-Maria' - OK
        // split word into two Strings - OK
        // exit array -
//        for (String name : names) {
//            if (name == "Ana-Maria") {
//                String firstName = name.split("-")[0];
//                String secondName = name.split("-")[1];
//                System.out.println(firstName);
//                System.out.println(secondName);
//                break;
//            }
//        }

        boolean flag = true;

//        while (flag) {
//            System.out.println("Hello from inside the while loop");
//            flag = false;
//        }

//        do {
//            System.out.println("hello from do block");
//        } while (false);

        int[] arrays = {1, 23, 5, 11, -5, -15, 0};
        System.out.println(Arrays.toString(arrays));
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));


    }


}
