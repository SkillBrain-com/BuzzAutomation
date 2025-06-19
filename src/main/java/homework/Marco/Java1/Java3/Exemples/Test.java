package Java3.Exemples;

import Java3.inheritence.ElectricVehicle;

public class Test {


    public static void main(String[] args) {

//        Vehicle mercedes = new SportVehicle("Mercedes",2023, 250);
//        Vehicle byd = new ElectricVehicle("BYD", 2023, 100);
//        byd.startEngine();
//        for (int i = 0; i < 10; i++) {
//            byd.drive();
//        }
//        int batteryLevel = ((ElectricVehicle)byd).getBatteryLevel();
//        System.out.println("Battery level is: " + batteryLevel);
//        for (int i = 0; i < 2; i++) {
//            ((ElectricVehicle) byd).chargeBattery();
//        }
//        System.out.println("===========================");
//        batteryLevel = ((ElectricVehicle)byd).getBatteryLevel();
//        System.out.println("Battery level is: " + batteryLevel);

        ElectricVehicle tesla = new ElectricVehicle("Tesla", 2018, 89);
        tesla.drive();
        tesla.drive("very angry");
        tesla.drive(10);
        tesla.drive(60, "Please find nearby charging station");



    }
}
