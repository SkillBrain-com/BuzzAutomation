package homework.PasaricaAndrei.TemeHeartbeat;

public class Lasagna {

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
//1
        System.out.println("Minute in cuptor " + lasagna.expectedMinutesInOven());
//2
        int cookedMinutes = 15;
        int remaining = lasagna.remainingMinutesInOven(cookedMinutes);

        System.out.println("Lasagna mai trebuie sa stea în cuptor " + remaining);
//3
        int layers = 4;
        int prepTime = lasagna.preparationTimeInMinutes(layers);

        System.out.println("Timpul de pregătire pentru " + layers + " este " + prepTime);
//4
        int minutesInOven = 20;

        int totalTime = lasagna.totalTimeInMinutes(layers, minutesInOven);
        System.out.println("Timp total " + totalTime);
    }

    // Ex 1 returnează timpul așteptat în cuptor
    public int expectedMinutesInOven() {
        return 40;
    }

    // Ex 2 calculează cât timp mai trebuie să stea lasagna în cuptor
    public int remainingMinutesInOven(int minutesCooked) {
        return expectedMinutesInOven() - minutesCooked;

    }

    // Ex 3 pregătire în funcție de numărul de straturi
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // Ex 4 timp total de lucru
    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}
