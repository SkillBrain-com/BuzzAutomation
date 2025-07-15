package homework.MihaiAlexe.Java3.NeedForSpeed;

public class MainNeedForSpeed {
    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);
        int distance = 100;
        RaceTrack track = new RaceTrack (distance);
        boolean canFinish = track.carcanFinish(car);
        System.out.println("Can the car finish the race? " + canFinish);
        NeedForSpeed nitro = NeedForSpeed.nitro();
        nitro.drive();
        System.out.println("Nitro car has driven: " + nitro.distanceDriven() + " meters");
    }
}
