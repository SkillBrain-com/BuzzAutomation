package homework.AndreiB.mostenirea;

public class CapacitatePortbagaj extends MijloaceDeTransport{
    private String litri;
    private String pozitionareaPortbagajului;

    public CapacitatePortbagaj(String brand, String capacitateCilindrica, String tipMijlocDeTransport, String numarPasageri, String caiPutere, String greutate) {
        super(brand, capacitateCilindrica, tipMijlocDeTransport, numarPasageri, caiPutere, greutate);
        litri = "150 l";
        pozitionareaPortbagajului = "Portbagajul se afla in spate";
    }

    public String getLitri() {
        return litri;
    }

    public String getPozitionareaPortbagajului() {
        return pozitionareaPortbagajului;
    }

    @Override
    public String toString() {
        return "CapacitatePortbagaj{" +
                "litri='" + litri + '\'' +
                ", pozitionareaPortbagajului='" + pozitionareaPortbagajului + '\'' +
                '}';
    }
}
