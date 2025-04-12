package javabasics1;

public class FisrtMethod {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        sum(a, b);
    }
    static int sum(int firstNumber, int secondNumber) {
       int result = firstNumber + secondNumber;
        System.out.println(result);
        return result;
    }
}
