package homework.edinita.javaPart2.courses;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int [] intArray = {20, 35, -15, 7, 55, 1, -22};
        //                {20, -15, 7, 35, 1, -22, 55}
        //                {-15, 7, 20, 1, -22, 35, 55}
        //                {-15, 7, 1, -22, 20, 35, 55}
        // write an algorithm that sorts the array ascending

        System.out.println(Arrays.toString(intArray));


        for (int lastUnsortedIndex= intArray.length -1; lastUnsortedIndex >0; lastUnsortedIndex-- ) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[i+1]) {
                    // swap
                    int temp = intArray[i]; // 35
                    intArray[i] = intArray[i+1]; // -15
                    intArray[i+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(intArray));




    }


}
