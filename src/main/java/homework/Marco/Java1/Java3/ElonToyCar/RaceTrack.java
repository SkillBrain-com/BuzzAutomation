package Java3.ElonToyCar;

public class RaceTrack {


    private final int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        int battery = 100;
        int distanceCovered = 0;

        while (battery >= car.getBatteryDrain()) {
            distanceCovered += car.getSpeed();
            battery -= car.getBatteryDrain();

            if (distanceCovered >= distance) {
                return true;
            }
        }

        return distanceCovered >= distance;
    }
}
