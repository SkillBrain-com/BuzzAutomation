package Java2;

public class Arrays {

    public static void main(String[] args) {

//        int[] intArray = new int[7];
//      intArray[0] = 15;
//       intArray[4] = 25;
//        intArray[5] = 30; // --->  runtime error !!!!
//        intArray[6] = 99;
//        System.out.println("array lenght is:" +intArray.length);
//
//        for (int i = 0; i < intArray.length ; i++) {
//            System.out.println(intArray[i] );
//        }

//        String [] arrayString = new String[2];
//        arrayString[0] = "Ana"; //[Ana, null]
//        arrayString[1] = "Blandiana"; //[Ana, Blandiana]
//        arrayString[0] = "Georgiana"; //[Georgiana, Blandiana]
//        arrayString[1] = null; //[Georgiana, null]
//
//        for (int i = 0; i < arrayString.length; i++) {
//            System.out.println(arrayString[1]);

//        boolean[] booleans = new boolean[] {true, false, true, true}; //OK
        boolean [] booleans = new boolean [4]; //OK
//
//        boolean [] tempArray = booleans;
//
//        booleans = new boolean[6];
//        booleans = tempArray;


        for (int i = 0; i < booleans.length; i++) {
            System.out.println(booleans[i]);
        }




    }


}
