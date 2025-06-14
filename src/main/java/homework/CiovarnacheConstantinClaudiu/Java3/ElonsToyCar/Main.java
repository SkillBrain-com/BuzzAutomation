package homework.CiovarnacheConstantinClaudiu.Java3.ElonsToyCar;

public class Main {
    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();

        System.out.println(car.distanceDisplay()); // Expected: Driven 0 meters
        System.out.println(car.batteryDisplay());  // Expected: Battery at 100%

        car.drive();
        car.drive();

        System.out.println(car.distanceDisplay()); // Expected: Driven 40 meters
        System.out.println(car.batteryDisplay());  // Expected: Battery at 98%

        // Să golim bateria
        for (int i = 0; i < 200; i++) {
            car.drive();
        }

        System.out.println(car.distanceDisplay()); // Expected: Driven 2000 meters
        System.out.println(car.batteryDisplay());  // Expected: Battery empty
    }
}
