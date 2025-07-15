package homework.PasaricaAndrei.Ex1;

public class ElonsToyCar2 {

    private int distanceDriven;

    private ElonsToyCar2() {
        this.distanceDriven = 0;
    }

    public static ElonsToyCar2 buy() {
        return new ElonsToyCar2();
    }


    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public void drive() {
        distanceDriven += 20;
    }

    public static void main(String[] args) {
        ElonsToyCar2 car = ElonsToyCar2.buy();
        System.out.println(car.distanceDisplay()); // => "Driven 0 meters"
        car.drive();
        System.out.println(car.distanceDisplay()); // => "Driven 20 meters"
    }
}

