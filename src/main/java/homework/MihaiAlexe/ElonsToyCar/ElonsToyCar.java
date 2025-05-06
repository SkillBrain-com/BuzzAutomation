package homework.MihaiAlexe.ElonsToyCar;


public class ElonsToyCar {

    public int distanceDriven = 0;
    public int batteryPercentage = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
    public String distanceDisplay() {
        return "Driven " + distanceDriven + " m";
    }
    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        } else {
            return "Battery level " + batteryPercentage + " %";
        }
    }
    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;

        }
    }


}
