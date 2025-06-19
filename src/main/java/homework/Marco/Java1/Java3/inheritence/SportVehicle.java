package Java3.inheritence;

public class SportVehicle extends Vehicle {

    //super
    private int topSpeed;
    private String make;

    public SportVehicle(String brand, int year) {
        super(brand, year);
        System.out.println("Calling super constructor");
    }

    public SportVehicle(String brand, int year, int topSpeed){
        this(brand, year);
        this.topSpeed = topSpeed;
        System.out.println("Sportive vehicle is ready");
    }

    @Override
    public void drive() {
        System.out.println("Driving " + brand + " very fast");
    }

    public void boost() {
        System.out.println(brand + " is boosting to speeds greater than " + topSpeed + "!");
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public String getMake() {
        return make;
    }









}
