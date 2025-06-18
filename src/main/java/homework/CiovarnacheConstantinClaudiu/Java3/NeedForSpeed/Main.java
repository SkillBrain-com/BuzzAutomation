package homework.CiovarnacheConstantinClaudiu.Java3.NeedForSpeed;

public class Main {
    public static void main(String[] args) {
        NeedForSpeed car = new NeedForSpeed(5, 2);
        RaceTrack track = new RaceTrack(100);

        System.out.println("Can the car finish the race?");
        System.out.println(track.carCanFinish(car) ? "Yes ✅" : "No ❌");

        // Nitro test
        NeedForSpeed nitro = NeedForSpeed.nitro();
        nitro.drive();
        System.out.println("Nitro distance: " + nitro.distanceDriven() + " meters");
    }
}
