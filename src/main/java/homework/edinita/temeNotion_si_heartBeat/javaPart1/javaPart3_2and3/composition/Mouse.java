package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.composition;

public class Mouse extends Product{
    private boolean isWareless = true;
    private String numberOfFunctions = "4";
    private String defaultColor = "black";

    public Mouse(String model, String manufacturer, String company) {
        super(model, manufacturer, company);
    }


    public String getNumberOfFunctions() {
        return numberOfFunctions;
    }

    public void setNumberOfFunctions(String numberOfFunctions) {
        this.numberOfFunctions = numberOfFunctions;
    }

    public String getDefaultColor() {
        return defaultColor;
    }

    public void setDefaultColor(String defaultColor) {
        this.defaultColor = defaultColor;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "isWareless=" + isWareless +
                ", numberOfFunctions='" + numberOfFunctions + '\'' +
                ", defaultColor='" + defaultColor + '\'' +
                '}';
    }
}
