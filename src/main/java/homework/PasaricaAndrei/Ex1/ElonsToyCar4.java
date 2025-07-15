package homework.PasaricaAndrei.Ex1;

public class ElonsToyCar4 {

    private int distanceDriven;
    private int batteryPercentage;

    private ElonsToyCar4() {
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }

    public static ElonsToyCar4 buy() {
        return new ElonsToyCar4();
    }

    //conducem 20m si scadem 1% din baterie
    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        return batteryPercentage == 0
                ? "Battery empty"
                : "Battery at " + batteryPercentage + "%";
    }

    public static void main(String[] args) {
        ElonsToyCar4 car = ElonsToyCar4.buy();
        car.drive(); // +20
        car.drive(); // +20
        System.out.println(car.distanceDisplay());   // => "40m"
        System.out.println(car.batteryDisplay());    // => "bateria 98%"
    }
}

