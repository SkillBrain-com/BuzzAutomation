package homework.PasaricaAndrei.Ex1.Ex2;

public class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int battery;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.battery = 100;
    }

//    public void drive() {
//        if (battery >= batteryDrain) {
//            distanceDriven += speed;
//            battery -= batteryDrain;
//        }
//    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            battery -= batteryDrain;
        }
    }

    public int getBattery() {
        return battery;
    }

    public boolean canDrive() {
        return battery >= batteryDrain;
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

}

