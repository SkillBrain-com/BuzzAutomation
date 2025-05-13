package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.transport.motor.motor.motorMasina;

import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.combustibil.Benzina;
import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.combustibil.Gpl;
import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.motor.Motor;

public class MotorGpl implements Motor {
    private final String model;
    private final String anFabricatie;
    private final Gpl gpl;




    public MotorGpl(String model, String anFabricatie, Gpl gpl) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.gpl = gpl;
    }



    @Override
    public String toString() {
        return "MotorGpl{" +
                "model='" + model + '\'' +
                ", anFabricatie='" + anFabricatie + '\'' +
                ", gpl=" + gpl +
                '}';
    }
}
