package homework.ClaudiuCiovarnache.Java2;

public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
    }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        System.out.println("Timpul total în cuptor: " + lasagna.expectedMinutesInOven() + " minute");
        System.out.println("Timpul rămas în cuptor (după 30 minute): " + lasagna.remainingMinutesInOven(30) + " minute");
        System.out.println("Timpul de pregătire pentru 2 straturi: " + lasagna.preparationTimeInMinutes(2) + " minute");
        System.out.println("Timpul total de gătire (3 straturi, 20 minute în cuptor): " + lasagna.totalTimeInMinutes(3, 20) + " minute");
    }
}
