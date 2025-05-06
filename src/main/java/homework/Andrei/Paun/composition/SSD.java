package homework.Andrei.Paun.composition;

public class SSD extends Product {

    private String memory;

    private String speedOfDataTransfer;

    public SSD(String model, String manufacturer, String company) {
        super(model, manufacturer, company);

        memory = "500gb";
        speedOfDataTransfer = "150mb/s";
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
