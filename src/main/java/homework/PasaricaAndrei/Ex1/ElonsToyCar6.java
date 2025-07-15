package homework.PasaricaAndrei.Ex1;

public class ElonsToyCar6 {

    private int distanceDriven;
    private int batteryPercentage;

    private ElonsToyCar6() {
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }

    public static ElonsToyCar6 buy() {
        return new ElonsToyCar6();
    }

    // conducem mașina doar dacă bateria este > 0
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
        return batteryPercentage == 0 ? "Battery empty" : "Battery at " + batteryPercentage + "%";
    }

    public static void main(String[] args) {
        ElonsToyCar6 car = ElonsToyCar6.buy();

        // descarcam complet bateria cu 100 de drive()
        for (int i = 0; i < 100; i++) {
            car.drive();
        }

        // conducem dar nimic nu se intampla
        car.drive();

        System.out.println(car.distanceDisplay());  // => "condus 2000m "
        System.out.println(car.batteryDisplay());   // => "bateria descarcata"
    }
}
