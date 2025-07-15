package homework.MihaiAlexe.Java3.NeedForSpeed;

public class RaceTrack {
    public int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }
    public boolean carcanFinish (NeedForSpeed car){
        int maxDistance = (car.battery / car.batteryDrain) * car.speed;
        return maxDistance >= this.distance;

    }


}

