package homework.AndreiB.marti18_02;

public class Exc {

    public static void calculNrPrime(int num) {
                int ct1 = 0;
        for (int i = 2; i <= num; i++) {
            int contor = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contor++;
                }
            }
            if (contor < 3) {
                System.out.println(" Numarul: " + i + " are " + contor + " numere prime");
            } else {
                System.out.println(" Numarul: " + i + " are " + contor + " mai multi divizori");
            }
        }

    }

    public static void main(String[] args) {
        calculNrPrime(100);
    }


}
