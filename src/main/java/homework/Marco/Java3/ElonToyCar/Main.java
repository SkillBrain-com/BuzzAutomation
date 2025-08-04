package homework.Marco.Java3.ElonToyCar;

public class Main {


    public static void main(String[] args) {
        NeedForSpeed car1 = new NeedForSpeed(5, 2);
        car1.drive();
        System.out.println("Distance Driven: " + car1.distanceDriven()); // => 5
        System.out.println("Battery Drained: " + car1.batteryDrained()); // => false

        NeedForSpeed nitroCar = NeedForSpeed.nitro();
        nitroCar.drive();
        System.out.println("Nitro Distance: " + nitroCar.distanceDriven()); // => 50

        RaceTrack race = new RaceTrack(100);
        System.out.println("Can car finish race? " + race.carCanFinish(new NeedForSpeed(5, 2))); // => true
    }
}
