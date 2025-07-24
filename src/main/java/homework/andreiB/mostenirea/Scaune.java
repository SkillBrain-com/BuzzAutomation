package homework.andreiB.mostenirea;

public class Scaune extends MijloaceDeTransport{
    private String producator;
    private String material;
    private String tipScaun;

    public Scaune(String brand, String capacitateCilindrica, String tipMijlocDeTransport, String numarPasageri, String caiPutere, String greutate) {
        super(brand, capacitateCilindrica, tipMijlocDeTransport, numarPasageri, caiPutere, greutate);
        producator = "Recaro";
        material = "Piele alcantara";
        tipScaun = "Confort";

    }

    public String getProducator() {
        return producator;
    }

    public String getMaterial() {
        return material;
    }

    public String getTipScaun() {
        return tipScaun;
    }

    @Override
    public String toString() {
        return "Scaune{" +
                "producator='" + producator + '\'' +
                ", material='" + material + '\'' +
                ", tipScaun='" + tipScaun + '\'' +
                '}';
    }
}
