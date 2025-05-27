package homework.Emanuel.Homework_Java2;

public class Lasagna {

    public static void main(String[] args) {
        System.out.println("The estimated oven time is: " + waitedMinutesInOven() + "!");
        System.out.println("The estimated time left in the oven is: " + restingMinutesInOven(30) + "!");
        System.out.println("The time spent on each layer is: " +
                           preparationTimeInMinutes(2) + "!");
        System.out.println("The total coocking time for lasagna is " +
                           totalTimeInMinutes(3, 20) + "!");

    }
    public static int waitedMinutesInOven(){
        int minuteTimpLaCuptor = 40;
        return minuteTimpLaCuptor;
    }
    public static int restingMinutesInOven(int numartimplacuptorr){
     int Rezultat = waitedMinutesInOven() - numartimplacuptorr;
     return Rezultat;

    }
    public static int preparationTimeInMinutes(int straturiLasagna){

        return straturiLasagna * 2;
    }
    public static Integer totalTimeInMinutes(int numarStraturi, int numarMinuteLasagnaCuptor){
        int MinuteGatireLasagnia = numarStraturi * 2;

        return MinuteGatireLasagnia + numarMinuteLasagnaCuptor;
    }
}
