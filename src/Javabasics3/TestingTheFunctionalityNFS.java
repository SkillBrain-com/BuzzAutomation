package Javabasics3;

public class TestingTheFunctionalityNFS {
    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        car.drive();
        System.out.println("Distance drive: " + car.getDistanceDriven());

        System.out.println("Battery drained: " + car.batteryDrained());

        NeedForSpeed nitroCar = NeedForSpeed.nitro();
        nitroCar.drive();
        System.out.println("Nitro car distance driven: " + nitroCar.getDistanceDriven());

        int distance = 100;
        RaceTrack raceTrack = new RaceTrack(distance);
        System.out.println("Can car finish the race: " + raceTrack.carCanFinish(car));
    }
}
