package homework.AndreiB.mostenirea;

public class SUV extends MijloaceDeTransport{
    private String cutieDeViteza;

    private String tipTractiune;

    private String combustibil;

    private String capacitateCilindrica;

    private String tipMijlocDeTransport;

    private String brand;

    public SUV(String brand, String capacitateCilindrica, String tipMijlocDeTransport, String numarPasageri, String caiPutere, String greutate) {
        super(brand, capacitateCilindrica, tipMijlocDeTransport, numarPasageri, caiPutere, greutate);
        this.cutieDeViteza = "Manuala";
        this.tipTractiune = "4X4";
        this.combustibil = "Diesel";
        this.capacitateCilindrica = "6000";
        this.tipMijlocDeTransport = "Privat";
        this.brand = "Dodge RAM";
    }

    public String getCutieDeViteza() {
        return cutieDeViteza;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String getTipMijlocDeTransport() {
        return tipMijlocDeTransport;
    }

    public String getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public String getTipTractiune() {
        return tipTractiune;
    }

    @Override
    public String toString() {
        return "SUV{" +
                "cutieDeViteza='" + cutieDeViteza + '\'' +
                ", tipTractiune='" + tipTractiune + '\'' +
                ", combustibil='" + combustibil + '\'' +
                ", capacitateCilindrica='" + capacitateCilindrica + '\'' +
                ", tipMijlocDeTransport='" + tipMijlocDeTransport + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
