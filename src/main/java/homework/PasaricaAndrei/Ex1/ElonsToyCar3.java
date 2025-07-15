package homework.PasaricaAndrei.Ex1;

public class ElonsToyCar3 {

    private int distanceDriven;
    private int batteryPercentage;

    private ElonsToyCar3() {
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }

    public static ElonsToyCar3 buy() {
        return new ElonsToyCar3();
    }
    // simuleaza conducerea mașinuței
    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }
    // distanța condusă
    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }
    // bateria rămasă
    public String batteryDisplay() {
        return batteryPercentage == 0
                ? "Battery empty"
                : "Battery at " + batteryPercentage + "%";
    }

    public static void main(String[] args) {
        ElonsToyCar3 car = ElonsToyCar3.buy();
        System.out.println(car.distanceDisplay());   // "condus 0m"
        System.out.println(car.batteryDisplay());    // "bateria 100%"
        car.drive();
        System.out.println(car.distanceDisplay());   // "condus 20m"
        System.out.println(car.batteryDisplay());    // "bateria 99%"
    }
}

