package homework.GabrielaDumitru.javabasics2;

public class JavaBasic2 {

    public static void main(String[] args) {
        int [] arrays = {1,3,5,7,8,10,15,23};

        for (int i = 0; arrays.length > i; i++) {
            System.out.println(i);
        }

        // FOREACH
        for ( int number : arrays) {
            System.out.println(number);
        }

        String [] names = {"Ana    ", "    Maria", "Gabriela", "Monica"};
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }



        // iterate array - OK
        // find 'Ana-Maria' - OK
        // split word into two Strings - ok
        // exit array -

        String[] names1 = {"Gabriela","Ana-Maria", "Monica","Mihaela"};
        for (String name : names1) {
            System.out.println(name);
            if (name == "Ana-Maria") {
                String firstName = name;
                String secondName = name; // split
                break;
            }
        }

        boolean flag = true;
        while (flag) {
            System.out.println("Hello from inside the while loop");
            flag = false;
        }

        do {
            System.out.println("hello from do block");
        } while (false);

        int[] arrayss = {1,3,5,7,8,10,15,23};
        int [][] multyArray = {
                {1,3,5},
                {3,7,9},
                {9,10,15}

        };

        for (int i=0 ; i < multyArray.length; i++) {
            for (int j=0; j < multyArray[i].length; j++) {
                System.out.println(multyArray[i][j] +",");
            }
        }


//        int array1 = {1 ,23, 5, 11, -5, 0};
//        System.out.println(Arrays.toString(array1));
//        Arrays.sort(array1);
//        System.out.println(Arrays.toString(array1));




    }
}
