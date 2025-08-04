package homework.Marco.Java3.inheritence;

public class Vehicle {

    protected String brand;
    protected int year;

    public Vehicle() {
        brand = "Ford";
        year = 2003;
    }

    //Vehicle(String, int)
    //Vehicle(int, String)

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public Vehicle(int year, String brand) {
        this.brand = brand;
        this.year = year;
    }

    public void startEngine() {
        System.out.println(brand + " engine started.");

    }

    public void drive() {
        System.out.println("Driving the " + brand);
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}
