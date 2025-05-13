package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.tema.aerian;

import temeNotion_si_heartBeat.javaPart3_2and3.tema.MijloaceDeTransport;

public class BalonCuAerCald extends MijloaceDeTransport {

    private int nrPasageri;
    private double altitudineMaxima;

    public BalonCuAerCald(int nrPasageri, double altitudineMaxima) {
        this.nrPasageri = nrPasageri;
        this.altitudineMaxima = altitudineMaxima;

        setConsumRidicat(altitudineMaxima > 1000 ? "true" : "false");
        setConsumVariabil(altitudineMaxima < 1000 ? "true" : "false");

        setCapacitateMare(nrPasageri > 5 ? "true" : "false");
        setCapacitateVariabila(nrPasageri < 5 ? "true" : "false");

        setCostRidicat(altitudineMaxima > 1000 ? "true" : "false");
        setCostVariat(altitudineMaxima < 1000 ? "true" : "false");

        setTehnologieAvansata(altitudineMaxima > 1000 ? "true" : "false");
        setTehnologieSpecializata(altitudineMaxima < 1000 ? "true" : "false");

        setVitezaRidicata(nrPasageri > 5 ? "true" : "false");
        setVitezaVariabila(nrPasageri < 5 ? "true" : "false");



    }


    public String tipBalonCuAerCald() {
        return nrPasageri > 5 ? "Cursa Speciala" : "Recreatie";
    }

    @Override
    public String toString() {
        return "BalonCuAerCald{" +
                "nrPasageri=" + nrPasageri +
                ", altitudineMaxima=" + altitudineMaxima +
                ", tipBalonCuAerCald='" + tipBalonCuAerCald() +
                ", consumRidicat='" + getConsumRidicat() +
                ", capacitateMare='" + getCapacitateMare() +
                ", costRidicat='" + getCostRidicat() +
                ", tehnologieAvansata='" + getTehnologieAvansata() +
                ", tehnologieSpecializata='" + getTehnologieSpecializata() +
                ", vitezaRidicata='" + getVitezaRidicata() +
                '}';
    }
}
