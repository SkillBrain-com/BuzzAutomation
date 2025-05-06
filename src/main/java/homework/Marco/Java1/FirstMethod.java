package Java1;

public class FirstMethod {

    public static void main(String[] args) {

        int a = 100;
        int b = 25;
        int resultSum = sum(a, b);
        int multiplyResult = multiply(a, b);
        int modulo = division(a,b);
        double doubleResult = getDouble();
        returnNothing();


        System.out.println(resultSum);
        System.out.println(multiplyResult);
        System.out.println(modulo);
        System.out.println(getDouble());
        System.out.println(myString());


    }

    static int multiply (int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    static int division (int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

    static double getDouble() {
        return 1.5;
    }


    static int sum (int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static void returnNothing() {
        System.out.println("Hello world");
    }

    static String myString() {
        return "text";
    }
}
