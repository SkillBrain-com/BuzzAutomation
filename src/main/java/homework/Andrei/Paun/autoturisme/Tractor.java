package homework.Andrei.Paun.autoturisme;

public class Tractor extends Transporturi {

    private String marca;
    private String model;
    private int anFabricatie;
    private String transmisie;

    public Tractor() {
        this.marca = "John Deere";
        this.model = "8R 410";
        this.anFabricatie = 2023;
        this.transmisie = "Automata PowerShift";
    }

    public Tractor(String marca, String model, int anFabricatie, String transmisie) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.transmisie = transmisie;
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

    public String getTransmisie() {
        return transmisie;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", transmisie='" + transmisie + '\'' +
                '}';
    }
}