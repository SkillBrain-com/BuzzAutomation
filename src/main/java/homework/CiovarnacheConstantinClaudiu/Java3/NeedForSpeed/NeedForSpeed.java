package homework.CiovarnacheConstantinClaudiu.Java3.NeedForSpeed;

public class NeedForSpeed {
    private final int speed;
    private final int batteryDrain;
    private int battery = 100;
    private int distanceDriven = 0;

    // Constructor - Task 1
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    // Task 3 + 4: Drive & update distance + battery
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

    // Task 5: Nitro car
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}
