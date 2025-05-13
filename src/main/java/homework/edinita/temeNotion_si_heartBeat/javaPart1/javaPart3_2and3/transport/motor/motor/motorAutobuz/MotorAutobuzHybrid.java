package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.transport.motor.motor.motorAutobuz;

import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.combustibil.Hybrid;
import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.motor.Motor;

public class MotorAutobuzHybrid implements Motor {
    private final String model;
    private final String anFabricatie;
    private final Hybrid hybrid;

    public MotorAutobuzHybrid(String model, String anFabricatie, Hybrid hybrid) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.hybrid = hybrid;
    }

    @Override
    public String toString() {
        return "MotorAutobuzHybrid{" +
                "model='" + model + '\'' +
                ", anFabricatie='" + anFabricatie + '\'' +
                ", hybrid=" + hybrid +
                '}';
    }
}
