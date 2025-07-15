package homework.MihaiAlexe.Java2;

public class LasagnaHomework {

    public static int expectedMinutesInOven() {
        return 40;
    }
    public static int remainingMinutesInOven(int timeInTheOven) {
        return expectedMinutesInOven() - timeInTheOven;
    }
    public static int preparationTimeInMinutes(int numberOfLayers)  {
        return numberOfLayers * 2;
    }
    public static int totalTimeInMinutes(int numberOfLayers, int timeInTheOven) {
        return preparationTimeInMinutes(numberOfLayers) + timeInTheOven;
    }
    public static void main(String[] args) {
        System.out.println("Expected minutes in the oven: " + expectedMinutesInOven());
        System.out.println("Remaining minutes in the oven: " + remainingMinutesInOven(30));
        System.out.println("Preparation time in minutes: " + preparationTimeInMinutes(3));
        System.out.println("Total time in minutes: " + totalTimeInMinutes(3, 20));
    }
}


