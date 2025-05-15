package homework.AndreiB.exercitii;

public class Exercitiul1 {

    public static void main(String[] args) {

        int x = 24;
        int o = -24;
        int y = 0;
        checkNumber(24);
        checkNumber(-24);
        checkNumber(0);
    }

    public static void checkNumber(int number) {

        if (number > 0) {
            System.out.println("pozitiv");
        } else if (number < 0) {
            System.out.println("negativ");
        } else {
            System.out.println("neutru");
        }
    }
}





