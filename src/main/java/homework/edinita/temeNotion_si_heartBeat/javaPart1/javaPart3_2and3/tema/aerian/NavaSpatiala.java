package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.tema.aerian;

import temeNotion_si_heartBeat.javaPart3_2and3.tema.MijloaceDeTransport;

public class NavaSpatiala extends MijloaceDeTransport {
    private int vitezaOrbitala;
    private double masaNava;

    public NavaSpatiala( int vitezaOrbitala, double masaNava) {
        this.vitezaOrbitala = vitezaOrbitala;
        this.masaNava = masaNava;

        setTehnologieSpecializata(masaNava > 10000 ? "true" : "false");
        setVitezaRidicata(vitezaOrbitala > 20000 ? "true" : "false");
        setConsumVariabil(vitezaOrbitala > 10000 ? "true" : "false");
        setCostRidicat(masaNava > 100000 ? "true" : "false");
    }

    public String tipNavaSpatiala() {
        return vitezaOrbitala > 10000 ? "NavaSpatialaAvansata" : "NavaSpatialaStandard";
    }

    @Override
    public String toString() {
        return "NavaSpatiala{" +
                "vitezaOrbitala=" + vitezaOrbitala +
                ", masaNava=" + masaNava +
                ", tehnologieSpecializata=" + getTehnologieSpecializata() +
                ", vitezaRidicata=" + getVitezaRidicata() +
                ", consumVariabil=" + getConsumVariabil() +
                ", costRidicat=" + getCostRidicat() +
                '}';
    }
}
