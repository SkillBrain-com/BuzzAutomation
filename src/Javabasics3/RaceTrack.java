package Javabasics3;



public class RaceTrack {
    private int distance;

    public RaceTrack (int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish (NeedForSpeed car) {
        int totalDistance = 0;
        int battery = 100;

        while (battery >= car.getBatteryDrain() && totalDistance < distance) {
            totalDistance += car.getSpeed();
            battery -= car.getBatteryDrain();
        }
        return totalDistance >= distance;
    }
}
