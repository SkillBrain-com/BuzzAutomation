package homework.Marco.Java2;

public class JavaBasics2 {
    public static void main(String[] args) {

//        int [] arrays = {1,3,5,7,8,10,15,23};
//
//        for (int i = 0; i <arrays.length ; i++) {
//            System.out.println(arrays [i]);
//        }
//
//        // FOREACH
//
//        for (int n : arrays) {
//            System.out.println(n);
//        }
//
//        String [] names = {"Gabriela","Ana-Maria", "Monica", "Mihaela"};
//
//        //iterate array - OK
//        //find 'Ana-Maria' - OK
//        //split words into two Strings - OK
//        //exit array - OK
//
//        for (String name : names) {
//            if (name == "Ana-Maria") {
//                String FirstName = name.split("-")[0];
//                String SecondName = name.split("-")[1];
//                System.out.println(FirstName);
//                System.out.println(SecondName);
//                break;
//            }
//        }
//
//        boolean flag = true;
//        while (flag) {
//            System.out.println("Hello from inside the while loop");
//            flag= false;
//        }

//        do {
//            System.out.println("Hello from the do block");
//        } while (false);
//
//        int[] arrays = {1, 3, 5, 7, 8, 10, 15, 23};

        int[][] multiArray = {
                {1, 3, 5},
                {3, 7, 9, 12, 15, 18},
                {9, 11, 15, 22}
        };

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + ",");
            }
            System.out.println(multiArray[i].length);
            System.out.println();
        }
        }


    }

