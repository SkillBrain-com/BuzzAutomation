package homework.AndreiB.exercitii;

public class Exercitiul2 {

    public static long toMilesPerHour(double kilometresPerHour) {
        if (kilometresPerHour < 0) {
            return -1;
        }
        return Math.round(kilometresPerHour / 1.609);


    }

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
    }
}
