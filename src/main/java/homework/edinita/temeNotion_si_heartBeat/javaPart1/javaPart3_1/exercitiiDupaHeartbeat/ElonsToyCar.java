package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_1.exercitiiDupaHeartbeat;

public class ElonsToyCar {
    int totalMeters;
    int fullBattery;

    public ElonsToyCar() {
        this.fullBattery = 100;
        this.totalMeters = 0;
    }

    public ElonsToyCar(int speed, int batteryDrain) {

    }

    // Static factory method to return a new instance
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    void drive() {
        if (this.fullBattery > 0) {
            this.totalMeters += 20;
            this.fullBattery -= 2;
        }
    }


    void batteryDisplay() {
        if (this.fullBattery < 0) {
            System.out.println("\t\t//=> Battery empty");
        } else {
            System.out.println("\t\t//=> Battery at " + this.fullBattery + "%");
        }
    }

    void distanceDisplay() {
        System.out.println("\t\t//=> Driven " + totalMeters + " meters");
    }

    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy(); // Correct object creation
        car.drive();
        car.drive();

        car.drive();

        car.drive();

        car.drive();

        car.drive();
        car.drive();
        car.drive();
        car.drive();

        car.drive();

        car.drive();

        car.drive();
        car.drive();
        car.drive();

        car.drive();

        car.drive();
        car.drive();
        car.drive();

        car.drive();

        car.drive();

        car.drive();

        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();

        car.drive();

        car.drive();

        car.drive();

        car.drive();
        car.drive();
        car.drive();
        car.drive();

        car.drive();

        car.drive();

        car.drive();

        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();

        car.drive();

        car.drive();

        car.drive();

        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();

        car.drive();

        car.drive();
        car.drive();
        car.drive();
        car.drive();

        car.drive();

        car.drive();

        car.drive();

        car.drive();
        car.drive();
        car.drive();

        car.drive();

        car.drive();

        car.drive();

        car.drive();
        car.drive();
        car.drive();
        car.drive();

        car.drive();

        car.drive();

        car.drive();

        car.drive();
        car.drive();
        car.drive();

        car.drive();

        car.drive();


        car.drive();




        car.batteryDisplay();
        car.distanceDisplay();
    }
}
