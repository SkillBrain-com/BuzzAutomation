package homework.Andrei.Paun.composition;

public class Keyboard extends Product{

    private boolean keyboardForGaming = false;

    private boolean isWLAN = true;

    private boolean hasInternalBattery = true;


    public Keyboard(String model, String manufacturer, String company) {
        super(model, manufacturer, company);
    }

    public boolean isKeyboardForGaming() {
        return keyboardForGaming;
    }

    public void setKeyboardForGaming(boolean keyboardForGaming) {
        this.keyboardForGaming = keyboardForGaming;
    }

    public boolean isWLAN() {
        return isWLAN;
    }

    public void setWLAN(boolean WLAN) {
        isWLAN = WLAN;
    }

    public boolean isHasInternalBattery() {
        return hasInternalBattery;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardForGaming=" + keyboardForGaming +
                ", isWLAN=" + isWLAN +
                ", hasInternalBattery=" + hasInternalBattery +
                '}';
    }
}
