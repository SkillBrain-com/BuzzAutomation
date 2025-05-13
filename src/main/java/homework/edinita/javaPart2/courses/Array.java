package homework.edinita.javaPart2.courses;

public class Array {

    public static void main(String[] args) {

        // length = 5 -> 5-1 = 4
        // 0 1 2 3 4
        // 0 1 2 3 4 5 6
//        int [] intArray = new int[7];
//        intArray[0] = 15;
//        intArray[4] = 25;
//        intArray[5] = 30; // -> runtime error !!!!!
//        intArray[6] = 99;
//        System.out.println("array length is: "+intArray.length);
//
//        for(int i=0; i < intArray.length ; i++) {
//            System.out.println(intArray[i]); // intArray[1]; intArray[2];
//        }

        // 0 1
//        String[] arrayString = new String[2];
//        arrayString[0] = "Ana";  // [Ana, null]
//        arrayString[1] = "Blandiana"; //[Ana, Blandiana]
//        arrayString[0] = "Georgiana"; //[Georgiana, Blandiana]
//        arrayString[1] = null; //[Georgiana, null]
//
//        for (int i = 0; i < arrayString.length; i++) {
//            System.out.println(arrayString[i]);
//
//        }

//        boolean [] booleans = new boolean[] {true, false, true, true}; // OK
        boolean[] booleans = new boolean [4]; // OK

//        boolean [] tempArray = booleans;
//
//        booleans = new boolean[6];
//        booleans = tempArray;

        for (int i = 0; i < booleans.length; i++) {
            System.out.println(booleans[i]);
        }
    }

}
