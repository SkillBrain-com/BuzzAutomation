package homework.edinita.javaPart3.javaPart3_2and3.transport.motor.motor.motorAutobuz;


import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.combustibil.Diesel;
import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.motor.Motor;

public class MotorAutobuzDiesel implements Motor {
    private final String model;
    private final String anFabricatie;
    private final Diesel diesel;

    public MotorAutobuzDiesel(String model, String anFabricatie, Diesel diesel) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.diesel = diesel;
    }

    @Override
    public String toString() {
        return "MotorAutobuzDiesel{" +
                "model='" + model + '\'' +
                ", anFabricatie='" + anFabricatie + '\'' +
                ", diesel=" + diesel +
                '}';
    }
}
