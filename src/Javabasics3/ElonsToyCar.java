package Javabasics3;

public class ElonsToyCar {
    private int distanceDriven;
    private int batteryPercentage;

    private ElonsToyCar(){
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String batteryDisplay() {
        return "Driven" + " " + distanceDriven + " " + "meters";
    }

    public String  batteryDisplay1() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at" + " " + batteryPercentage + " " + "%";
    }

    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }

    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();

        System.out.println(car.batteryDisplay());
        System.out.println(car.batteryDisplay1());

        car.drive();
        car.drive();
        System.out.println(car.batteryDisplay());
        System.out.println(car.batteryDisplay1());

        for (int i = 0; i < 98; i++) {
            car.drive();
        }
        car.drive();
        System.out.println(car.batteryDisplay());
        System.out.println(car.batteryDisplay1());
    }

}
