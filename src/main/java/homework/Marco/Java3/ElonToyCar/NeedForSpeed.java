package homework.Marco.Java3.ElonToyCar;

public class NeedForSpeed {


    private final int speed;
    private final int batteryDrain;
    private int distanceDriven;
    private int battery;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
        this.distanceDriven = 0;
    }

    public void drive() {
        if (battery >= batteryDrain) {
            distanceDriven += speed;
            battery -= batteryDrain;
        }
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public int getDistanceDriven() {
        return distanceDriven;
    }

    public int getBattery() {
        return battery;
    }
}
