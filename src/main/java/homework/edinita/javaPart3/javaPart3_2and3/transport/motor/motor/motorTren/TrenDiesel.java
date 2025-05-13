package homework.edinita.javaPart3.javaPart3_2and3.transport.motor.motor.motorTren;

import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.combustibil.Benzina;
import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.combustibil.Diesel;
import temeNotion_si_heartBeat.javaPart3_2and3.transport.motor.motor.Motor;

public class TrenDiesel implements Motor {
    private final String model;
    private final String anFabricatie;
    private final Diesel diesel;

    public TrenDiesel(String model, String anFabricatie, Diesel diesel) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.diesel = diesel;
    }

    @Override
    public String toString() {
        return "TrenDiesel{" +
                "model='" + model + '\'' +
                ", anFabricatie='" + anFabricatie + '\'' +
                ", diesel=" + diesel +
                '}';
    }
}
