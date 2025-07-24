package homework.andreiB.exercitii;

public class Exercitiul5 {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.print("Introduceti un an: ");
        int year = 1997;


        if (isLeapYear(year)) {
            System.out.println(year + " este un an bisect.");
        } else {
            System.out.println(year + " nu este un an bisect.");
        }

    }
}










