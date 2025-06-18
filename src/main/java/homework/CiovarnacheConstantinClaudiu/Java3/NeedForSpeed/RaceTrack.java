package homework.CiovarnacheConstantinClaudiu.Java3.NeedForSpeed;

public class RaceTrack {
    private final int distance;

    // Constructor - Task 2
    public RaceTrack(int distance) {
        this.distance = distance;
    }

    // Task 6: Check if car can finish the race
    public boolean carCanFinish(NeedForSpeed car) {
        // Simulate driving until battery is drained
        while (!car.batteryDrained()) {
            car.drive();
        }

        return car.distanceDriven() >= distance;
    }
}
