package homework.andreiB.exercitii;

public class Exercitiul4 {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {


        return barking & (hourOfDay < 8 || hourOfDay > 22) & hourOfDay >= 0 & hourOfDay <= 23;

    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }


}
        


