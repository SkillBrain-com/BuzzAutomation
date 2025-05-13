package homework.edinita.javaPart3.courses.inheritence;

public class ElectricVehicle extends Vehicle {

    private int batteryLevel;

    public ElectricVehicle(String brand, int year, int batteryLevel) {
        super(year, brand);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void changerBattery() {
        System.out.println("Charging battery");
        batteryLevel++;
    }

    public void startEngine() {
        System.out.println(carBrand + " started electric motor silently.");
        batteryLevel--;
    }
    @Override
    public void drive() {
        System.out.println("Driving " + carBrand + " very silently");
        batteryLevel--;
    }
//   drive(null) ; drive(int)
    // overload
    public void drive(int batteryDrain) {
        System.out.println("Driving " + carBrand + " very silently");
        batteryLevel -= batteryDrain;
    }

    // Overload
    public void drive(String driverFeeling) {
        System.out.println("Driving " + carBrand + " very fast. Driver is very " + driverFeeling);

    }

    public void drive(int batteryDrain, String waring) {
        System.out.println("Driving " + carBrand + " very silently");
        batteryLevel -= batteryDrain;
        if (batteryLevel < 20) {
            System.out.println(waring);
        }
    }


}
