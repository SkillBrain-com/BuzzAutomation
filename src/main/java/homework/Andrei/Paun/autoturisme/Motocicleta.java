package homework.Andrei.Paun.autoturisme;

public class Motocicleta extends Transporturi{

    private String marca;
    private String model;
    private int anFabricatie;
    private String transmisie;

    public void Motocicleta() {
        this.marca = "Yamaha";
        this.model = "FZ-1";
        this.anFabricatie = 2022;
        this.transmisie = "Automata";
    }

    public Motocicleta(String marca, String model, int anFabricatie, String transmisie) {
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
        return "Motocicleta{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", transmisie='" + transmisie + '\'' +
                '}';
    }
}
