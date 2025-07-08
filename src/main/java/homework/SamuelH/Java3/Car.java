package Java3;

public class Car {
    public static void main(String[] args) {

        NeedForSpeed car = new NeedForSpeed(5, 2);
        car.drive();
        System.out.println("Distance driven: " + car.distanceDriven()); // 5
        System.out.println("Battery drained? " + car.batteryDrained()); // false

        NeedForSpeed nitroCar = NeedForSpeed.nitro();
        nitroCar.drive();
        System.out.println("Nitro distance driven: " + nitroCar.distanceDriven()); // 50

        RaceTrack track = new RaceTrack(100);
        System.out.println("Can car finish? " + track.carCanFinish(car)); // true
    }
}

