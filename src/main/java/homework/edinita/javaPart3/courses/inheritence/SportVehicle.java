package homework.edinita.javaPart3.courses.inheritence;

public class SportVehicle extends Vehicle {

    // super
    private int topSpeed;
    private String make;

    public void boost() {
        System.out.println(carBrand + " is boosting to speeds greater than " + topSpeed + "!");
    }

    public SportVehicle(String brand, int year) {
        super(brand, year);
        System.out.println("Calling super constructor");
    }

    public SportVehicle(String brand, int year, int topSpeed) {
        this(brand, year);
        this.topSpeed = topSpeed;
        System.out.println("Sports vehicle is ready");
    }

    // override
    @Override
    public void drive() {
        System.out.println("Driving " + carBrand + " very fast");
    }



    public int getTopSpeed() {
        return topSpeed;
    }

    public String getMake() {
        return make;
    }


}
