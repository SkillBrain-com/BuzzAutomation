package homework.Andrei.Paun.composition;

public class Mouse extends Product {

    private boolean isWLAN = true;

    private String numberOfFunctions = "4";

    private String defaultColour  = "black";

    public Mouse(String model, String manufacturer, String company) {
        super(model, manufacturer, company);
    }

    public String getNumberOfFunctions() {
        return numberOfFunctions;
    }

    public void setNumberOfFunctions(String numberOfFunctions) {
        this.numberOfFunctions = numberOfFunctions;
    }

    public String getDefaultColour() {
        return defaultColour;
    }

    public void setDefaultColour(String defaultColour) {
        this.defaultColour = defaultColour;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "isWLAN=" + isWLAN +
                ", numberOfFunctions='" + numberOfFunctions + '\'' +
                ", defaultColour='" + defaultColour + '\'' +
                '}';
    }
}
