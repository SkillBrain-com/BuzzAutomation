package homework.AndreiB.exercitii;

public class Exb {

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);


    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(18, 17, 19));
        System.out.println(hasTeen(44, 1, 20));
        System.out.println(hasTeen(15, 39, 53));
    }
}
