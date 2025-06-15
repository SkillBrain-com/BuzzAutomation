package homework.CiovarnacheConstantinClaudiu.Java2;


public class Lasagna {

    // 1. Timpul așteptat în cuptor (constanta)
    public int expectedMinutesInOven() {
        return 40;
    }

    // 2. Minutele rămase în cuptor (40 minus minutele deja petrecute)
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    // 3. Timpul de preparare în funcție de numărul de straturi (2 min per strat)
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    // 4. Timpul total lucrat: preparare + timp în cuptor
    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
    }

    // Optional: main pentru testare
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        System.out.println("Expected oven time: " + lasagna.expectedMinutesInOven()); // 40
        System.out.println("Remaining time if cooked 30 min: " + lasagna.remainingMinutesInOven(30)); // 10
        System.out.println("Preparation time for 2 layers: " + lasagna.preparationTimeInMinutes(2)); // 4
        System.out.println("Total time for 3 layers and 20 min in oven: " + lasagna.totalTimeInMinutes(3, 20)); // 26
    }
}
