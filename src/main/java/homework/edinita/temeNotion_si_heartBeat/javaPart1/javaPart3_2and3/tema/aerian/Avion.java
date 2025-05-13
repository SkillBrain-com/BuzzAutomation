package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.tema.aerian;

import temeNotion_si_heartBeat.javaPart3_2and3.tema.MijloaceDeTransport;

public class Avion extends MijloaceDeTransport {
    private int anModel;
    private int capacitatePasageri;
    private double vitezaMaxima;
    private double autonomieZbor;
    private char tipMotor;

    public Avion(int anModel, int capacitatePasageri, double vitezaMaxima, double autonomieZbor, char tipMotor) {
        this.anModel = anModel;
        this.capacitatePasageri = capacitatePasageri;
        this.vitezaMaxima = vitezaMaxima;
        this.autonomieZbor = autonomieZbor;
        this.tipMotor = tipMotor;

        setTehnologieAvansata(anModel < 2000 ? "true" : "false");
        setVitezaRidicata(vitezaMaxima > 400 ? "true" : "false");
        setCapacitateMare(capacitatePasageri > 100 ? "true" : "false");
        setConsumRidicat(tipMotor == 'D' ? "false" : tipMotor == 'B' ? "true" : "ai bagat un tip de motor gresit");
        setCostRidicat(autonomieZbor > 3000 ? "true" : "false");
    }

    public double durataZbor(double distance) {
        return distance / vitezaMaxima;
    }

    public String tipAvion() {
        return capacitatePasageri > 150 ? "Commercial" : "Privat";
    }

    @Override
    public String toString() {
        return "Avion{" +
                "anModel=" + anModel +
                ", capacitatePasageri=" + capacitatePasageri +
                ", vitezaMaxima=" + vitezaMaxima +
                ", autonomieZbor=" + autonomieZbor +
                ", tipMotor=" + tipMotor +
                ", tehnologieAvansata=" + getTehnologieAvansata() +
                ", vitezaRidicata=" + getVitezaRidicata() +
                ", capacitateMare=" + getCapacitateMare() +
                ", consumRidicat=" + getConsumRidicat() +
                ", costRidicat=" + getCostRidicat() +
                '}';
    }
}
