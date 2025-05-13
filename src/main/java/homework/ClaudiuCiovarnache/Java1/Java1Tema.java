package homework.ClaudiuCiovarnache.Java1;
import java.util.Scanner;

public class Java1Tema {

    public static void printMessage() {
        System.out.println("Imi place Java");
    }

    public static void printRepeatedMessage() {
        for (int i = 0; i < 6; i++) {
        }
    }

    public static void calculateDavidAge() {
        int anaAge = 24;
        int davidAge = anaAge - 6;
        System.out.println("David are " + davidAge + " ani.");
    }

    public static void readSentence() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti o propozitie: ");
        String sentence = scanner.nextLine();
        System.out.println("Ati introdus: " + sentence);
    }

    public static void myVariables() {
        int number = 10;
        String text = "Hello";
        boolean flag = true;
        System.out.println("Numar: " + number + ", Text: " + text + ", Flag: " + flag);
    }

    public static void readAndPrintNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int num2 = scanner.nextInt();
        System.out.println("Numerele introduse sunt: " + num1 + " si " + num2);
    }

    public static void mathOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");
        double num = scanner.nextDouble();
        System.out.println("Suma cu 5: " + (num + 5));
        System.out.println("Scaderea cu 12.3: " + (num - 12.3));
        System.out.println("Inmultirea cu -3.2: " + (num * -3.2));
        System.out.println("Impartirea cu 4: " + (num / 4));
        System.out.println("Modulul cu 6: " + (num % 6));
    }

    public static void fixCommentedCode() {
        int x = 2;
        int y = 12;


        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        printMessage();
        printRepeatedMessage();
        calculateDavidAge();
        readSentence();
        myVariables();
        readAndPrintNumbers();
        mathOperations();
        fixCommentedCode();
    }
}
