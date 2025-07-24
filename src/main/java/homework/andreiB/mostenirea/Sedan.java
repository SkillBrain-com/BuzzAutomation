package homework.andreiB.mostenirea;

public class Sedan extends MijloaceDeTransport{

    private String cutieDeViteza;

    private String tipTractiune;

    private String combustibil;

    private String capacitateCilindrica;


    private String brand;

    public CapacitatePortbagaj capacitatePortbagaj;

    public String roti;

    public String scaune;

    public String  caiPutere;

    public String numarPasageri;

    public String greutate;


    public Sedan(String brand, String capacitateCilindrica, String tipMijlocDeTransport, String numarPasageri, String caiPutere, String greutate) {
        super(brand, capacitateCilindrica, tipMijlocDeTransport, numarPasageri, caiPutere, greutate);
        this.cutieDeViteza = "Automata";
        this.tipTractiune = "2X4";
        this.combustibil = "Gasoline";
        this.capacitateCilindrica = "2499 Cm cubi";
        this.brand = "BMW";
        this.caiPutere = "237 CP";
        this.numarPasageri = "5";
        this.greutate = "1589 Kg net";
        this.roti = "245 X 55 R20";
        this.scaune = "Recaro Sport";
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


    public String getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public void setCapacitateCilindrica(String capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CapacitatePortbagaj getCapacitatePortbagaj() {
        return capacitatePortbagaj;
    }

    public void setCapacitatePortbagaj(CapacitatePortbagaj capacitatePortbagaj) {
        this.capacitatePortbagaj = capacitatePortbagaj;
    }

    public String getRoti() {
        return roti;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public String getScaune() {
        return scaune;
    }

    public void setScaune(String scaune) {
        this.scaune = scaune;
    }

    public String getCaiPutere() {
        return caiPutere;
    }

    public void setCaiPutere(String caiPutere) {
        this.caiPutere = caiPutere;
    }

    public String getNumarPasageri() {
        return numarPasageri;
    }

    public void setNumarPasageri(String numarPasageri) {
        this.numarPasageri = numarPasageri;
    }

    public String getGreutate() {
        return greutate;
    }

    public void setGreutate(String greutate) {
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "cutieDeViteza='" + cutieDeViteza + '\'' +
                ", tipTractiune='" + tipTractiune + '\'' +
                ", combustibil='" + combustibil + '\'' +
                ", capacitateCilindrica='" + capacitateCilindrica + '\'' +
                ", tipMijlocDeTransport='" + super.getTipMijlocDeTransport() + '\'' +
                ", brand='" + brand + '\'' +
                ", capacitatePortbagaj=" + capacitatePortbagaj +
                ", roti='" + roti + '\'' +
                ", scaune='" + scaune + '\'' +
                ", caiPutere='" + caiPutere + '\'' +
                ", numarPasageri='" + numarPasageri + '\'' +
                ", greutate='" + greutate + '\'' +
                '}';
    }
}
