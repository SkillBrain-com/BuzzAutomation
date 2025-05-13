package homework.edinita.javaPart3.javaPart3_2and3.transport.motor.motor.motorAutobuz;

import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.combustibil.Electric;
import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.motor.Motor;

public class MotorAutobuzElectric implements Motor {
    private final String model;
    private final String anFabricatie;
    private final Electric electric;

    public MotorAutobuzElectric(String model, String anFabricatie, Electric electric) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.electric = electric;
    }

    @Override
    public String toString() {
        return "MotorAutobuzElectric{" +
                "model='" + model + '\'' +
                ", anFabricatie='" + anFabricatie + '\'' +
                ", electric=" + electric +
                '}';
    }
}
