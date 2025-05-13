package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.transport.motor.motor.motorAutobuz;

import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.combustibil.Benzina;
import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.motor.Motor;

public class MotorAutobuzBenzina implements Motor {
    private final String model;
    private final String anFabricatie;
    private final Benzina benzina;

    public MotorAutobuzBenzina(String model, String anFabricatie, Benzina benzina) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.benzina = benzina;
    }

    @Override
    public String toString() {
        return "MotorAutobuzBenzina{" +
                "model='" + model + '\'' +
                ", anFabricatie='" + anFabricatie + '\'' +
                ", benzina=" + benzina +
                '}';
    }
}
