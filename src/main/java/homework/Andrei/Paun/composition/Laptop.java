package homework.Andrei.Paun.composition;

public class Laptop extends Product {

    private String memorieRam;

    private String typeOfOs;

    private String capacity;

    private String diagonal;

    private String typeOfKeyboard;

    private Monitor monitor;

    private Mouse mouse;

    private SSD ssd;



    public Laptop(String model, String manufacturer, String company,
                  String memorieRam, String typeOfOs, String capacity, String diagonal, String typeOfKeyboard) {
        super(model, manufacturer, company);
        this.memorieRam = memorieRam;
        this.typeOfOs = typeOfOs;
        this.capacity = capacity;
        this.diagonal = diagonal;
        this.typeOfKeyboard = typeOfKeyboard;
    }

    public Laptop(String model, String manufacturer, String company) {
        super(model, manufacturer, company);
        this.memorieRam = "32GB";
        this.typeOfOs = "Windows";
        this.capacity = "15000 mA";
        this.diagonal = "15 inch";
        this.typeOfKeyboard = "right side";
    }

    public String getTypeOfOs() {
        return typeOfOs;
    }

    public void setTypeOfOs(String typeOfOs) {
        this.typeOfOs = typeOfOs;
    }

    public String getMemorieRam() {
        return memorieRam;
    }

    public void setMemorieRam(String memorieRam) {
        this.memorieRam = memorieRam;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String getTypeOfKeyboard() {
        return typeOfKeyboard;
    }

    public void setTypeOfKeyboard(String typeOfKeyboard) {
        this.typeOfKeyboard = typeOfKeyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public SSD getSsd() {
        return ssd;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "memorieRam='" + memorieRam + '\'' +
                ", typeOfOs='" + typeOfOs + '\'' +
                ", capacity='" + capacity + '\'' +
                ", diagonal='" + diagonal + '\'' +
                ", typeOfKeyboard='" + typeOfKeyboard + '\'' +
                ", monitor=" + monitor +
                ", mouse=" + mouse +
                ", ssd=" + ssd +
                '}';
    }
}
