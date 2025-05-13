package homework.ClaudiuCiovarnache.Java3.NeedForSpeed;

public class RaceTrack {
    private int distance;


    public RaceTrack(int distance) {
        this.distance = distance;
    }


    public boolean carCanFinish(NeedForSpeed car) {
        int tempDistance = 0;
        int tempBattery = 100;

        while (tempBattery >= car.batteryDrain) {
            tempDistance += car.speed;
            tempBattery -= car.batteryDrain;
        }

        return tempDistance >= distance;
    }
}
