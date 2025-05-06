package homework.Andrei.Paun.composition;

public class Xbox extends Product {

    private String resolution;

    private String numberOfControlers;

    private String gamingGPU;

    private Monitor monitor;

    private Mouse mouse;

    private Keyboard keyboard;


    public Xbox(String model, String manufacturer, String company) {
        super(model, manufacturer, company);
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getNumberOfControlers() {
        return numberOfControlers;
    }

    public void setNumberOfControlers(String numberOfControlers) {
        this.numberOfControlers = numberOfControlers;
    }

    public String getGamingGPU() {
        return gamingGPU;
    }

    public void setGamingGPU(String gamingGPU) {
        this.gamingGPU = gamingGPU;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    @Override
    public String toString() {
        return "Xbox{" +
                "resolution='" + resolution + '\'' +
                ", numberOfControlers='" + numberOfControlers + '\'' +
                ", gamingGPU='" + gamingGPU + '\'' +
                ", monitor=" + monitor +
                ", mouse=" + mouse +
                ", keyboard=" + keyboard +
                '}';
    }
}
