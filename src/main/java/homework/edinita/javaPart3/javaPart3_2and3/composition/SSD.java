package homework.edinita.javaPart3.javaPart3_2and3.composition;

public class SSD extends Product{
    private String memory;
    private String speedOfDataTransfer;


    public SSD(String model, String manufacturer, String company) {
        super(model, manufacturer, company);
        this.memory = "500GB";
        this.speedOfDataTransfer = "100 mb/s";

    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getSpeedOfDataTransfer() {
        return speedOfDataTransfer;
    }

    public void setSpeedOfDataTransfer(String speedOfDataTransfer) {
        this.speedOfDataTransfer = speedOfDataTransfer;
    }

    @Override
    public String toString() {
        return "SSD{" +
                "memory='" + memory + '\'' +
                ", speedOfDataTransfer='" + speedOfDataTransfer + '\'' +
                '}';
    }
}
