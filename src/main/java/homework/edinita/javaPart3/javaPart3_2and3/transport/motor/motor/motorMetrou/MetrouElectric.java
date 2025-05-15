package homework.edinita.javaPart3.javaPart3_2and3.transport.motor.motor.motorMetrou;


import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.combustibil.Electric;
import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.motor.Motor;

public class MetrouElectric implements Motor {
    private final String model;
    private final String anFabricatie;
    private final Electric electric;

    public MetrouElectric(String model, String anFabricatie, Electric electric) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.electric = electric;
    }

    @Override
    public String toString() {
        return "MetrouElectric{" +
                "model='" + model + '\'' +
                ", anFabricatie='" + anFabricatie + '\'' +
                ", electric=" + electric +
                '}';
    }
}
