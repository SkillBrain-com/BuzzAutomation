package Java3.inheritence;

public class ElectricVehicle extends Vehicle{
     private int batteryLevel;

     public ElectricVehicle(String brand, int year, int batteryLevel) {
         super(year, brand);
         this.batteryLevel = batteryLevel;
     }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void chargeBattery() {
         System.out.println("Charging battery");
         batteryLevel++;
     }

    public void startEngine() {
        System.out.println(brand + " started electric motor silently.");
        batteryLevel--;
    }

    @Override
     public void drive() {
         System.out.println("Driving " + brand + " very silently");
         batteryLevel--;
     }

    //overload
    public void drive(String driverFeeling) {
        System.out.println("Driving" + brand + " very fast. Driver is very " + driverFeeling);
    }

    public void drive(int batteryDrain) {
        System.out.println("Driving " + brand + " very silently");
        batteryLevel-= batteryDrain;
    }

    public void drive(int batteryDrain, String warning) {
        System.out.println("Driving " + brand + " very silently");
        batteryLevel-= batteryDrain;
        if(batteryLevel < 20) {
            System.out.println(warning);
        }
    }


}
