package homework.edinita.javaPart3.courses.inheritence;

public class Vehicle {

    protected String carBrand;
    protected int carYear;

    public Vehicle() {
        carBrand = "Ford";
        carYear = 2003;
    }

//    Vehicle(String, int)
//    Vehicle(int, String)

    public Vehicle(String brand, int carYear) {
        this.carBrand = brand;
        this.carYear = carYear;
    }

    public Vehicle(int carYear, String brand) {
        this.carBrand = brand;
        this.carYear = carYear;
    }

    public void startEngine() {
        System.out.println(carBrand + " engine started.");

    }

    public void drive() {
        System.out.println("Driving the " + carBrand);
    }

    public String getCarBrand() {
        return carBrand;
    }

    public int getcarYear() {
        return carYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "carBrand='" + carBrand + '\'' +
                ", carYear=" + carYear +
                '}';
    }
}
