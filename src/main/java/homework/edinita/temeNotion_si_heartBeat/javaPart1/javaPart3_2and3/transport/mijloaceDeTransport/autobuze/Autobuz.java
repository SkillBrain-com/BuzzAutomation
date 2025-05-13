package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.transport.mijloaceDeTransport.autobuze;

import temeNotion_si_heartBeat.javaPart3_2and3.transport.mijloaceDeTransport.Transport;

public class Autobuz implements Transport {
    private String model;
    private String companie;
    private String anFabricatie;


    public Autobuz(String model, String companie, String anFabricatie) {
        this.model = model;
        this.companie = companie;
        this.anFabricatie = anFabricatie;
    }

    public String getModel() {
        return model;
    }

    public String getCompanie() {
        return companie;
    }

    public String getAnFabricatie() {
        return anFabricatie;
    }

    @Override
    public String merge() {
        return "";
    }

    @Override
    public String consuma() {
        return "";
    }


    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", companie='" + companie + '\'' +
                ", anFabricatie='" + anFabricatie + '\'' +
                '}';
    }
}
