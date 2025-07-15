package homework.PasaricaAndrei.Ex1.Ex2;

public class NeedForSpeed2 {

    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);
        NeedForSpeed car1 = NeedForSpeed.nitro();
        System.out.println("Speed: " + car.getSpeed());               // viteza 5
        System.out.println("Battery drain: " + car.getBatteryDrain()); // baterie 2
        car.drive();
        System.out.println("Distance driven: " + car.distanceDriven() + " meters"); //  5
        car.drive();
        System.out.println("Battery drained: " + car.batteryDrained());//  fals
        car.drive();
        System.out.println("Distance driven: " + car.distanceDriven() + " meters"); //  50m
        car.drive();
        System.out.println("Distance driven: " + car1.distanceDriven() + " meters"); //  50m
    }


}

