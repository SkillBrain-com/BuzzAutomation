package homework.PasaricaAndrei.teme_notion1;

public class Ex8 {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        //y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;
        System.out.println(x);
        System.out.println(y);
    }
}
