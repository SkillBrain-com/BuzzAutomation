package homework.PasaricaAndrei.Ex1;

public class ElonsToyCar5 {

    private int distanceDriven;
    private int batteryPercentage;

    private ElonsToyCar5() {
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }

    public static ElonsToyCar5 buy() {
        return new ElonsToyCar5();
    }

    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }

    //distanța parcursă
    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    //bateria rămasă
    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage + "%";
    }

    public static void main(String[] args) {
        ElonsToyCar5 car = ElonsToyCar5.buy();
        car.drive(); // 1% consum
        car.drive(); // 1% consum
        System.out.println(car.distanceDisplay());   // "condus 40m"
        System.out.println(car.batteryDisplay());    //  "baterie 98%"
    }
}
