package homework.Andrei.Paun.autoturisme;

public class Tren extends Transporturi{

    private String tipTren; // Marfar, Călători, Metrou
    private String companie;
    private String tipLocomotiva;
    private int numarVagoane;
    private int capacitatePasageri;
    private String vitezaMaxima; // km/h
    private String lungimeTotala; // metri

    public Tren() {
        this.tipTren ="Calatori";
        this.companie = "CFR";
        this.tipLocomotiva = "Electrica";
        this.numarVagoane = 5;
        this.capacitatePasageri = 250;
        this.vitezaMaxima = "160 km/h";
        this.lungimeTotala = "100 m";
    }

    public Tren(String tipTren, String companie, String tipLocomotiva, int numarVagoane, int capacitatePasageri, String vitezaMaxima, String lungimeTotala) {
        this.tipTren = tipTren;
        this.companie = companie;
        this.tipLocomotiva = tipLocomotiva;
        this.numarVagoane = numarVagoane;
        this.capacitatePasageri = capacitatePasageri;
        this.vitezaMaxima = vitezaMaxima;
        this.lungimeTotala = lungimeTotala;
    }

    public String getTipTren() {
        return tipTren;
    }

    public void setTipTren(String tipTren) {
        this.tipTren = tipTren;
    }

    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public String getTipLocomotiva() {
        return tipLocomotiva;
    }

    public void setTipLocomotiva(String tipLocomotiva) {
        this.tipLocomotiva = tipLocomotiva;
    }

    public int getNumarVagoane() {
        return numarVagoane;
    }

    public void setNumarVagoane(int numarVagoane) {
        this.numarVagoane = numarVagoane;
    }

    public int getCapacitatePasageri() {
        return capacitatePasageri;
    }

    public void setCapacitatePasageri(int capacitatePasageri) {
        this.capacitatePasageri = capacitatePasageri;
    }

    public String getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(String vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public String getLungimeTotala() {
        return lungimeTotala;
    }

    public void setLungimeTotala(String lungimeTotala) {
        this.lungimeTotala = lungimeTotala;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "tipTren='" + tipTren + '\'' +
                ", companie='" + companie + '\'' +
                ", tipLocomotiva='" + tipLocomotiva + '\'' +
                ", numarVagoane=" + numarVagoane +
                ", capacitatePasageri=" + capacitatePasageri +
                ", vitezaMaxima='" + vitezaMaxima + '\'' +
                ", lungimeTotala='" + lungimeTotala + '\'' +
                '}';
    }
}

