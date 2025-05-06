package homework.Andrei.Paun.autoturisme;

public class Elicopter extends Transporturi{

    private String tipElicopter;
    private String companie;
    private String tipMotor;
    private int numarRotoare;
    private String capacitatePasageri;
    private String vitezaMaxima;
    private String altitudineMaxima;
    private int autonomie;

    public Elicopter(){

        this.tipElicopter = "Salvare";
        this.companie = "Caritas";
        this.tipMotor = "2 × Safran Arriel 2E (Turboshaft)";
        this.numarRotoare = numarRotoare;
        this.capacitatePasageri = "8 + echipaj (2 piloți + paramedici)";
        this.vitezaMaxima = "260 km/h";
        this.altitudineMaxima = "6.000 metri";
        this.autonomie = 650;


    }

    public Elicopter(String tipElicopter, String companie, String tipMotor, int numarRotoare, String capacitatePasageri, String vitezaMaxima, String altitudineMaxima, int autonomie) {
        this.tipElicopter = tipElicopter;
        this.companie = companie;
        this.tipMotor = tipMotor;
        this.numarRotoare = numarRotoare;
        this.capacitatePasageri = capacitatePasageri;
        this.vitezaMaxima = vitezaMaxima;
        this.altitudineMaxima = altitudineMaxima;
        this.autonomie = autonomie;
    }

    public String getTipElicopter() {
        return tipElicopter;
    }

    public String getTipMotor() {
        return tipMotor;
    }

    public String getCompanie() {
        return companie;
    }

    public int getNumarRotoare() {
        return numarRotoare;
    }

    public String getVitezaMaxima() {
        return vitezaMaxima;
    }

    public String getCapacitatePasageri() {
        return capacitatePasageri;
    }

    public String getAltitudineMaxima() {
        return altitudineMaxima;
    }

    public int getAutonomie() {
        return autonomie;
    }

    @Override
    public String toString() {
        return "Elicopter{" +
                "tipElicopter='" + tipElicopter + '\'' +
                ", companie='" + companie + '\'' +
                ", tipMotor='" + tipMotor + '\'' +
                ", numarRotoare=" + numarRotoare +
                ", capacitatePasageri='" + capacitatePasageri + '\'' +
                ", vitezaMaxima='" + vitezaMaxima + '\'' +
                ", altitudineMaxima='" + altitudineMaxima + '\'' +
                ", autonomie=" + autonomie +
                '}';
    }
}
