package homework.Andrei.Paun.autoturisme;

public class Avion extends Transporturi {

    private String model;
    private int anFabricatie;
    private String combustibil;
    private int numarLocuri;
    private String companieAeriana;

    public Avion(){
        this.model = "Airbus A380";
        this.anFabricatie = 2005;
        this.combustibil = "Kerosene";
        this.numarLocuri = 850;
        this.companieAeriana = "Emirates";
    }

    public Avion(String model, int anFabricatie, String combustibil, int numarLocuri, String companieAeriana) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.combustibil = combustibil;
        this.numarLocuri = numarLocuri;
        this.companieAeriana = companieAeriana;
    }

    public String getModel() {
        return model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    public String getCompanieAeriana() {
        return companieAeriana;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", combustibil='" + combustibil + '\'' +
                ", numarLocuri=" + numarLocuri +
                ", companieAeriana='" + companieAeriana + '\'' +
                '}';
    }
}
