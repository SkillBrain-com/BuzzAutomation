package homework.ClaudiuCiovarnache.Java3.NeedForSpeed;

public class Main {
    public static void main(String[] args) {
        NeedForSpeed car = new NeedForSpeed(5, 2);
        car.drive();
        System.out.println(car.distanceDriven());
        System.out.println(car.batteryDrained());

        NeedForSpeed nitroCar = NeedForSpeed.nitro();
        nitroCar.drive();
        System.out.println(nitroCar.distanceDriven());

        RaceTrack raceTrack = new RaceTrack(100);
        System.out.println(raceTrack.carCanFinish(car));
    }
}

