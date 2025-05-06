package homework.Andrei.Paun.autoturisme;

public class Masina extends Transporturi {

    private String marca;
    private String model;
    private int anFabricatie;
    private String combustibil;
    private String cutieDeViteze;
    private int vitezaMaxima;

    public Masina() {
        this.marca = "Mercedes-Benz";
        this.model = "E class";
        this.anFabricatie = 2007;
        this.combustibil = "Diesel";
        this.cutieDeViteze = "Automata";
        this.vitezaMaxima = 260;
    }

    public Masina(String marca, String model, int anFabricatie, String combustibil, String cutieDeViteze, int vitezaMaxima) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.combustibil = combustibil;
        this.cutieDeViteze = cutieDeViteze;
        this.vitezaMaxima = vitezaMaxima;
    }

    public String getMarca() {
        return marca;
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

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public String getCutieDeViteze() {
        return cutieDeViteze;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", combustibil='" + combustibil + '\'' +
                ", cutieDeViteze='" + cutieDeViteze + '\'' +
                ", vitezaMaxima=" + vitezaMaxima +
                '}';
    }
}




