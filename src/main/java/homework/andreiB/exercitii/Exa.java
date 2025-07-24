package homework.andreiB.exercitii;

public class Exa {

    public static boolean hasEqualSum(int y, int x, int o) {
        return (y + x) == o;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(2, 2, 4));
        System.out.println(hasEqualSum(3, 5, 7));
    }
}
