package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.composition;

public class Xbox extends Product{
    private String resolution;
    private String numberOfControllers;
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

    public String getNumberOfControllers() {
        return numberOfControllers;
    }

    public void setNumberOfControllers(String numberOfControllers) {
        this.numberOfControllers = numberOfControllers;
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

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Xbox{" +
                "resolution='" + resolution + '\'' +
                ", numberOfControllers='" + numberOfControllers + '\'' +
                ", gamingGPU='" + gamingGPU + '\'' +
                ", monitor=" + monitor +
                ", mouse=" + mouse +
                ", keyboard=" + keyboard +
                '}';
    }
}
