package homework.edinita.javaPart3.javaPart3_2and3.transport.motor.motor.motorMasina;

import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.combustibil.Benzina;
import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.combustibil.Diesel;
import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.motor.Motor;

public class MotorBenzina implements Motor {
    private final String model;
    private final String anFabricatie;
    private final Benzina benzina;

    public MotorBenzina(String model, String anFabricatie, Benzina benzina) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.benzina = benzina;
    }


    @Override
    public String toString() {
        return "MotorBenzina{" +
                "model='" + model + '\'' +
                ", anFabricatie='" + anFabricatie + '\'' +
                ", benzina=" + benzina +
                '}';
    }
}
