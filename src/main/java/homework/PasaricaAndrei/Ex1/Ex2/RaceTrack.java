package homework.PasaricaAndrei.Ex1.Ex2;

public class RaceTrack {

    private int distance;

    // definim distanta traseului
    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
    public boolean carCanFinish(NeedForSpeed car) {
        int maxDistance = (100 / car.getBatteryDrain()) * car.getSpeed();
        return maxDistance >= distance;
    }
}


