package homework.edinita.javaPart3.javaPart3_2and3.transport.motor.motor.motorAvion;


import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.combustibil.Kerosen;
import homework.edinita.javaPart3.javaPart3_2and3.transport.motor.motor.Motor;

public class AvionReactie implements Motor {
    private final String model;
    private final String anFabricatie;
    private final Kerosen kerosen;

    public AvionReactie(String model, String anFabricatie, Kerosen kerosen) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.kerosen = kerosen;
    }

    @Override
    public String toString() {
        return "AvionReactie{" +
                "model='" + model + '\'' +
                ", anFabricatie='" + anFabricatie + '\'' +
                ", kerosen=" + kerosen +
                '}';
    }
}
