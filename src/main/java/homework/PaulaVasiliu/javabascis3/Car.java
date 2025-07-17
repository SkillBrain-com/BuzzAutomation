package homework.PaulaVasiliu.javabascis3;

public class Car {

    private String model;
    private String make;
    private final long VIN;
    private int numberOfWheels;
    private boolean isInssured;

    public Car() {
        VIN = 1241241 + 1000l;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public long getVIN() {
        return VIN;
    }


    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isInssured() {
        return isInssured;
    }

    public void setInssured(boolean inssured) {
        isInssured = inssured;
    }
}
