package homework.andreiB.mostenirea;

public class Roti extends MijloaceDeTransport{
    private String dimensiune;

    private String tipAnvelopa;

    private String dimensiuneET;

    private String dimensiuneJ;

    public Roti(String brand, String capacitateCilindrica, String tipMijlocDeTransport, String numarPasageri, String caiPutere, String greutate) {
        super(brand, capacitateCilindrica, tipMijlocDeTransport, numarPasageri, caiPutere, greutate);
        dimensiune = "19 INCH";
        tipAnvelopa = "255 X 65";
        dimensiuneET = "38";
        dimensiuneJ = "10";

    }

    public String getDimensiune() {
        return dimensiune;
    }

    public String getTipAnvelopa() {
        return tipAnvelopa;
    }

    public String getDimensiuneET() {
        return dimensiuneET;
    }

    public String getDimensiuneJ() {
        return dimensiuneJ;
    }

    @Override
    public String toString() {
        return "Roti{" +
                "dimensiune='" + dimensiune + '\'' +
                ", tipAnvelopa='" + tipAnvelopa + '\'' +
                ", dimensiuneET='" + dimensiuneET + '\'' +
                ", dimensiuneJ='" + dimensiuneJ + '\'' +
                '}';
    }
}
