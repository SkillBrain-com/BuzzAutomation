package javabasics2;

public class Lasagna {
    public static int expectedMinutesInOven() {
        return 40;
    }

    public static int remainingMinutesInOven(int timeInTheOven) {
        return expectedMinutesInOven() - timeInTheOven;
    }

    public static int preparationTimeInMinutes(int numersOfLayers) {
        return numersOfLayers + 2;
    }

    public static int totalTimeInMinutes(int numberOfLayers, int timeUnTheOven) {
        return preparationTimeInMinutes(numberOfLayers) + timeUnTheOven;
    }

    public static void main(String[] args) {
        System.out.println("remaining oven time in minutes:" + remainingMinutesInOven(30));
        System.out.println("preparation time in minutes:" + preparationTimeInMinutes(2));
        System.out.println("total working time in minutes:" + totalTimeInMinutes(3, 20));
    }
}
