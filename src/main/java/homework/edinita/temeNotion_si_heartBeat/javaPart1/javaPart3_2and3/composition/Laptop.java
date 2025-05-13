package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.composition;

public class Laptop extends Product{
    private String ramMemory;
    private int memorieRam;
    private String typeOS;
    private String capacity;
    private String diagonal;
    private String typeOfKeyboard;
    private Monitor monitor;
    private Mouse mouse;
    private SSD sdd;





    public Laptop(String model, String manufacturer, String company, String ramMemory, String typeOS, String capacity, String diagonal, String typeOfKeyboard) {
        super(model, manufacturer, company);

        this.ramMemory = ramMemory;
        this.typeOS = typeOS;
        this.capacity = capacity;
        this.diagonal = diagonal;
        this.typeOfKeyboard = typeOfKeyboard;

    }

    public Laptop(String model, String manufacturer, String company) {
        super(model, manufacturer, company);

        this.ramMemory = "8GB";
        this.typeOS = "Windows";
        this.capacity = "15000 mA";
        this.diagonal = "13 inch";
        this.typeOfKeyboard = "tightside";

    }

    public String getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(String ramMemory) {
        this.ramMemory = ramMemory;
    }

    public int getMemorieRam() {
        return memorieRam;
    }

    public void setMemorieRam(int memorieRam) {
        this.memorieRam = memorieRam;
    }

    public String getTypeOS() {
        return typeOS;
    }

    public void setTypeOS(String typeOS) {
        this.typeOS = typeOS;
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

    public SSD getSdd() {
        return sdd;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setSdd(SSD sdd) {
        this.sdd = sdd;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ramMemory='" + ramMemory + '\'' +
                ", memorieRam=" + memorieRam +
                ", typeOS='" + typeOS + '\'' +
                ", capacity='" + capacity + '\'' +
                ", diagonal='" + diagonal + '\'' +
                ", typeOfKeyboard='" + typeOfKeyboard + '\'' +
                ", monitor=" + monitor +
                ", mouse=" + mouse +
                ", sdd=" + sdd +
                '}';
    }
}
