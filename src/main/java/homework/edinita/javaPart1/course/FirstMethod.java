package homework.edinita.javaPart1.course;

public class FirstMethod {

    public static void main(String[] args) {

    }

    static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    static double getDouble() {
        return 1.5;
    }

    static int sum(int first, int second, int third) {
        return first + second + third;
    }


//  sum(int, int)
    static int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println(result);
        return result;
    }

// sum()
    static int sum() {
        return 0;
    }

    static void returnNothing(    ) {
    }

    static String returnString() {
        return "text";
    }

    static int returnNumber() {
        return 1;
    }

    static double returnDobule() {
        return 15.2;
    }


}
