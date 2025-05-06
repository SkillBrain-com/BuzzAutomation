package homework.MihaiAlexe.NeedForSpeed;

public class NeedForSpeed {

    public int speed;
    public int batteryDrain;
    public int battery = 100;
    public int distanceDriven = 0;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    public void drive() {
        if (battery>=batteryDrain) {
            distanceDriven+=speed;
            battery-=batteryDrain;
        }
    }
    public int distanceDriven() {
        return distanceDriven;
    }
    public boolean batteryDrained (){
        return battery<batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }



}
