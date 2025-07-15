package homework.AndreiB.Homework.homework3;

public class ElonsToyCar {

    int distanceDriven = 0;
    int batteryPercentage = 100;

    static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage + "%";
    }

    void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }

    public static void main(String[] args) {
        ElonsToyCar car = buy();

        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

        car.drive();
        car.drive();

        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

        for (int i = 0; i < 98; i++) {
            car.drive();
        }

        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }

}
