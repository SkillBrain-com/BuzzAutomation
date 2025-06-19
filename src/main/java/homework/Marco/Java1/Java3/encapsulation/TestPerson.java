package Java3.encapsulation;

import java.util.Arrays;

public class TestPerson {

    public static void main(String[] args) {
       int [] array = {10, 5, 8, -1, 0, 1};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
