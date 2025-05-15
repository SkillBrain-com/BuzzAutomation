package homework.edinita.javaPart3.javaPart3_2and3.transport.motor.motor.motorMasina;


import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.combustibil.Gpl;
import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.motor.Motor;

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
