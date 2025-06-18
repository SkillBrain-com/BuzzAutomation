package homework.GabrielaDumitru.Javabasics3;

public class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int batteryPercentage;
    private int distanceDriven;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.batteryPercentage = 100;
        this.distanceDriven = 0;
    }

    public void drive() {
        if (batteryPercentage >= batteryDrain) {
            distanceDriven += speed;
            batteryPercentage -= batteryDrain;
        }
    }

    public int getDistanceDriven() {
        return distanceDriven;
    }

    public boolean batteryDrained() {
        return batteryPercentage <= 0;
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

}