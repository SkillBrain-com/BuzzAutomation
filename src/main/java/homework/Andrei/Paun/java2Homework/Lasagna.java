package homework.Andrei.Paun.java2Homework;

public class Lasagna {

    // 1. Expected oven time
    public int expectedMinutesInOven() {
        return 40;
    }

    // 2. Remaining oven time
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    // 3. Preparation time (2 minute per layer)
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;

    }

    // 4. Total time = preparation + actual oven time
    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
    }
}


