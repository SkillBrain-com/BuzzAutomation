package homework.Andrei.Paun.autoturisme;

public class Vapor extends Transporturi {

    private String tipVapor; // Cargou, Pescador, Croazieră
    private String companie;
    private String tipPropulsie; // Diesel, Nuclear, Turbină cu gaz
    private double tonaj; // tone
    private int capacitatePasageri;
    private String vitezaMaxima; // noduri
    private String lungimeTotala; // metri



    public Vapor(String tipVapor, String companie, String tipPropulsie, double tonaj, int capacitatePasageri, String vitezaMaxima, String lungimeTotala) {
        this.tipVapor = tipVapor;
        this.companie = companie;
        this.tipPropulsie = tipPropulsie;
        this.tonaj = tonaj;
        this.capacitatePasageri = capacitatePasageri;
        this.vitezaMaxima = vitezaMaxima;
        this.lungimeTotala = lungimeTotala;
    }

    public Vapor() {
        this.tipVapor = "Croaziera";
        this.companie = "Royal Caribbean International";
        this.tipPropulsie = "Diesel-electrică";
        this.tonaj = 225.282;
        this.capacitatePasageri = 6780;
        this.vitezaMaxima = "22 noduri";
        this.lungimeTotala = "362 metri";
        {

        }



    }

    public String getTipVapor() {
        return tipVapor;
    }

    public String getCompanie() {
        return companie;
    }

    public String getTipPropulsie() {
        return tipPropulsie;
    }

    public double getTonaj() {
        return tonaj;
    }

    public int getCapacitatePasageri() {
        return capacitatePasageri;
    }

    public String getLungimeTotala() {
        return lungimeTotala;
    }

    public String getVitezaMaxima() {
        return vitezaMaxima;
    }

    @Override
    public String toString() {
        return "Vapor{" +
                "tipVapor='" + tipVapor + '\'' +
                ", companie='" + companie + '\'' +
                ", tipPropulsie='" + tipPropulsie + '\'' +
                ", tonaj=" + tonaj +
                ", capacitatePasageri=" + capacitatePasageri +
                ", vitezaMaxima='" + vitezaMaxima + '\'' +
                ", lungimeTotala='" + lungimeTotala + '\'' +
                '}';
    }
}
