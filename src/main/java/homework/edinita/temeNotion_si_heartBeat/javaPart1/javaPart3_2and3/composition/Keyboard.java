package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.composition;

public class Keyboard extends Product{
    private boolean keyboardForGaming = true;
    private  boolean isWireless = false;
    private boolean hasInternalBattery = false;

    public Keyboard(String model, String manufacturer, String company) {
        super(model, manufacturer, company);
    }

    public boolean isKeyboardForGaming() {
        return keyboardForGaming;
    }

    public void setKeyboardForGaming(boolean keyboardForGaming) {
        this.keyboardForGaming = keyboardForGaming;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    public boolean isHasInternalBattery() {
        return hasInternalBattery;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardForGaming=" + keyboardForGaming +
                ", isWireless=" + isWireless +
                ", hasInternalBattery=" + hasInternalBattery +
                '}';
    }
}
