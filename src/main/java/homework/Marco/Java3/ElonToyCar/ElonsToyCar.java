package homework.Marco.Java3.ElonToyCar;

public class ElonsToyCar {

    private int distanceDriven;
    private int batteryPercentage;

    // Private constructor
    private ElonsToyCar() {
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }

    // 1. Buy a brand-new car
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    // 2. Display the distance driven
    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    // 3. Display the battery percentage
    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage + "%";
    }

    // 4. Method to drive the car (combines battery check + update)
    public void drive() {
        if (canDrive()) {
            updateDistance();
            updateBattery();
        }
    }

    // 5. Separate method to update the distance
    private void updateDistance() {
        distanceDriven += 20;
    }

    // 6. Separate method to update the battery
    private void updateBattery() {
        batteryPercentage -= 1;
    }

    // Helper: check if the car can drive
    private boolean canDrive() {
        return batteryPercentage > 0;
    }

    public static void main(String[] args) {
        // Buy a brand-new car
        ElonsToyCar car = ElonsToyCar.buy();

        // Display initial distance and battery
        System.out.println(car.distanceDisplay());   // => "Driven 0 meters"
        System.out.println(car.batteryDisplay());    // => "Battery at 100%"

        // Drive the car a few times
        car.drive();
        car.drive();
        car.drive();

        // Display updated distance and battery
        System.out.println(car.distanceDisplay());   // => "Driven 60 meters"
        System.out.println(car.batteryDisplay());    // => "Battery at 97%"

        // Drain the battery completely
        for (int i = 0; i < 200; i++) {
            car.drive();
        }

        // Display final distance and battery status
        System.out.println(car.distanceDisplay());   // => "Driven 2000 meters"
        System.out.println(car.batteryDisplay());    // => "Battery empty"

        // Attempt to drive with dead battery
        car.drive();
        System.out.println(car.distanceDisplay());   // Should still be "Driven 2000 meters"

    }
}
