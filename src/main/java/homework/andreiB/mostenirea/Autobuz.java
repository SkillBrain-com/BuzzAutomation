package homework.andreiB.mostenirea;

public class Autobuz extends MijloaceDeTransport{

    private String cutieDeViteza;

    private String tipTractiune;

    private String combustibil;

    private String capacitateCilindrica;

    private String tipMijlocDeTransport;

    private String brand;

    public CapacitatePortbagaj capacitatePortbagaj;

    public Roti roti;

    public Scaune scaune;

    public String  caiPutere;

    public String numarPasageri;

    public String greutate;



    public Autobuz(String brand, String capacitateCilindrica, String tipMijlocDeTransport, String numarPasageri, String caiPutere, String greutate) {
        super(brand, capacitateCilindrica, tipMijlocDeTransport, numarPasageri, caiPutere, greutate);
        this.cutieDeViteza = "Manuala";
        this.tipTractiune = "4X8";
        this.combustibil = "Diesel";
        this.capacitateCilindrica = "7998 Cm cubi";
        this.tipMijlocDeTransport = "Transport in comun";
        this.brand = "Volvo";
        this.caiPutere = "279";
        this.numarPasageri = "35";
        this.greutate = "7000 Kg net";


    }

    public String getCutieDeViteza() {
        return cutieDeViteza;
    }

    public void setCutieDeViteza(String cutieDeViteza) {
        this.cutieDeViteza = cutieDeViteza;
    }

    public String getTipTractiune() {
        return tipTractiune;
    }

    public void setTipTractiune(String tipTractiune) {
        this.tipTractiune = tipTractiune;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }

    public CapacitatePortbagaj getCapacitatePortbagaj() {
        return capacitatePortbagaj;
    }

    public String getBrand() {
        return brand;
    }

    public Roti getRoti() {
        return roti;
    }

    public Scaune getScaune() {
        return scaune;
    }

    public String getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public String getTipMijlocDeTransport() {
        return tipMijlocDeTransport;
    }

    public String getCaiPutere() {
        return caiPutere;
    }

    public String getNumarPasageri() {
        return numarPasageri;
    }

    public String getGreutate() {
        return greutate;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "cutieDeViteza='" + cutieDeViteza + '\'' +
                ", tipTractiune='" + tipTractiune + '\'' +
                ", combustibil='" + combustibil + '\'' +
                ", capacitateCilindrica='" + capacitateCilindrica + '\'' +
                ", tipMijlocDeTransport='" + tipMijlocDeTransport + '\'' +
                ", brand='" + brand + '\'' +
                ", capacitatePortbagaj=" + capacitatePortbagaj +
                ", roti=" + roti +
                ", scaune=" + scaune +
                ", caiPutere='" + caiPutere + '\'' +
                ", numarPasageri='" + numarPasageri + '\'' +
                ", greutate='" + greutate + '\'' +
                '}';
    }
}
