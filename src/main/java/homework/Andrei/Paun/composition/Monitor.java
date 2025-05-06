package homework.Andrei.Paun.composition;

public class Monitor extends Product {

    private String diagonal;

    private String resolution;

    private String typeOfScreen;

    public Monitor(String model, String manufacturer, String company) {
        super(model, manufacturer, company);
        diagonal = "24";
        resolution = "1920x1080";
        typeOfScreen = "QLED";
    }

    public String getDiagonal() {
        return diagonal;
    }

    public String getResolution() {
        return resolution;
    }

    public String getTypeOfScreen() {
        return typeOfScreen;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal='" + diagonal + '\'' +
                ", resolution='" + resolution + '\'' +
                ", typeOfScreen='" + typeOfScreen + '\'' +
                '}';
    }
}
