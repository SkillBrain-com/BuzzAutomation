package Java3.Exemples;

public class Car {
    private String model;
    private String make;
    private long VIN;
    private int numberOfWheels;
    private boolean isInssured;

    //getter && setter
    //read && write

    public Car() {
        VIN = 31412124 + 1000l;
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

    public void setVIN(long VIN) {
        this.VIN = VIN;
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
