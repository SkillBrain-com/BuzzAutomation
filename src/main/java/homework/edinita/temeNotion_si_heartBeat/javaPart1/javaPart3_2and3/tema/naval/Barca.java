package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.tema.naval;

import temeNotion_si_heartBeat.javaPart3_2and3.tema.MijloaceDeTransport;

public class Barca extends MijloaceDeTransport {

    private String tipDeBarca;
    private int nrDeLocuri;
    private int vitezaMaxima;

    public Barca(String tipDeBarca, int nrDeLocuri, int vitezaMaxima) {
        this.tipDeBarca = tipDeBarca;
        this.nrDeLocuri = nrDeLocuri;
        this.vitezaMaxima = vitezaMaxima;

        setVitezaRidicata(vitezaMaxima > 50 ? "true" : "false");
        setCapacitateMare(nrDeLocuri > 5 ? "true" : "false");
        setCostRidicat(nrDeLocuri > 10 ? "true" : "false");
        setCostVariat(nrDeLocuri < 10 ? "true" : "false");
    }

    public void navigheazaPeMare() {
        System.out.println("Barca navigheaza pe mare la viteza de " + vitezaMaxima + " km/h");
    }

    public void navigheazaPeRaul() {
        System.out.println("Barca navigheaza pe rau la viteza de " + vitezaMaxima/2 + " km/h");
    }

    @Override
    public String toString() {
        return "Barca{" +
                "tipDeBarca='" + tipDeBarca + '\'' +
                ", nrDeLocuri=" + nrDeLocuri +
                ", vitezaMaxima=" + vitezaMaxima +
                ", vitezaRidicata=" + getVitezaRidicata() +
                ", costRidicat=" + getCostRidicat() +
                ", capacitateMare=" + getCapacitateMare() +
                '}';
    }
}
