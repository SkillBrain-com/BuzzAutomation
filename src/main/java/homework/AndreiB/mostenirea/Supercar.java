package homework.AndreiB.mostenirea;

public class Supercar extends MijloaceDeTransport{

    private String cutieDeViteza;

    private String tipTractiune;

    private String combustibil;

    private String capacitateCilindrica;

    private String tipMijlocDeTransport;

    private String brand;

    public Supercar(String brand, String capacitateCilindrica, String tipMijlocDeTransport, String numarPasageri, String caiPutere, String greutate) {
        super(brand, capacitateCilindrica, tipMijlocDeTransport, numarPasageri, caiPutere, greutate);

        this.cutieDeViteza = "Automata";
        this.tipTractiune = "2X4";
        this.combustibil = "Gasoline";
        this.capacitateCilindrica = "4000 cm cubi";
        this.tipMijlocDeTransport = "Privat";
        this.brand = "Ferrary";
    }

    public String getCutieDeViteza() {
        return cutieDeViteza;
    }

    public String getTipTractiune() {
        return tipTractiune;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public String getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    @Override
    public String getTipMijlocDeTransport() {
        return tipMijlocDeTransport;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Supercar{" +
                "cutieDeViteza='" + cutieDeViteza + '\'' +
                ", tipTractiune='" + tipTractiune + '\'' +
                ", combustibil='" + combustibil + '\'' +
                ", capacitateCilindrica='" + capacitateCilindrica + '\'' +
                ", tipMijlocDeTransport='" + tipMijlocDeTransport + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
