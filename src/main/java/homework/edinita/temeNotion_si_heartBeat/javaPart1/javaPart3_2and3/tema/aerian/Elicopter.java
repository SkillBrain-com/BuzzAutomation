package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.tema.aerian;

import temeNotion_si_heartBeat.javaPart3_2and3.tema.MijloaceDeTransport;

public class Elicopter extends MijloaceDeTransport {
    private int anFabricatie;
    private int capacitatePasageri;
    private double vitezaMaxima;
    private double altitudineMaxima;

    public Elicopter(int anFabricatie, int capacitatePasageri, double vitezaMaxima, double altitudineMaxima) {
        this.anFabricatie = anFabricatie;
        this.capacitatePasageri = capacitatePasageri;
        this.vitezaMaxima = vitezaMaxima;
        this.altitudineMaxima = altitudineMaxima;

        setTehnologieAvansata(anFabricatie > 2000 ? "true" : "false");
        setVitezaRidicata(vitezaMaxima > 300 ? "true" : "false");
        setCapacitateMare(capacitatePasageri > 10 ? "true" : "false");
        setConsumRidicat(vitezaMaxima > 250 ? "true" : "false");
    }

    public String tipElicopter() {
        return capacitatePasageri > 20 ? "Transport" : "Privat";
    }

    @Override
    public String toString() {
        return "Elicopter{" +
                "anFabricatie=" + anFabricatie +
                ", capacitatePasageri=" + capacitatePasageri +
                ", vitezaMaxima=" + vitezaMaxima +
                ", altitudineMaxima=" + altitudineMaxima +
                ", tehnologieAvansata=" + getTehnologieAvansata() +
                ", vitezaRidicata=" + getVitezaRidicata() +
                ", capacitateMare=" + getCapacitateMare() +
                ", consumRidicat=" + getConsumRidicat() +
                '}';
}

}
