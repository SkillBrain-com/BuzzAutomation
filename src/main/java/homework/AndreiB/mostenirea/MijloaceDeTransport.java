package homework.AndreiB.mostenirea;

public class MijloaceDeTransport {

    private String brand;

    private String capacitateCilindrica;

    private String tipMijlocDeTransport;

    private String numarPasageri;

    private String caiPutere;

    private String greutate;

    public MijloaceDeTransport (String brand, String capacitateCilindrica, String tipMijlocDeTransport,
                                String numarPasageri, String caiPutere, String greutate) {
        this.brand = brand;
        this.capacitateCilindrica = capacitateCilindrica;
        this.tipMijlocDeTransport = tipMijlocDeTransport;
        this.numarPasageri = numarPasageri;
        this.caiPutere = caiPutere;
        this.greutate = greutate;
    }
    public void model (){
        System.out.println("Brand-ul mijlocului de transport este " + brand);
    }

    public void capacitateCilindrica(){
        System.out.println("Capacitatea cilindrica a motorului este de " + capacitateCilindrica + "cm cubi");
    }
    public void tipMijlocDeTransport(){
        System.out.println("Tipul mijlocului de trasport este " + tipMijlocDeTransport);
    }
    public void numarPasageri() {
        System.out.println("Numarul maxim de pasageri este de " + numarPasageri + "pasageri");
    }
    public void caiPutere() {
        System.out.println("Mijlocul de transport are " + caiPutere + "CP");
    }
    public void greutate() {
        System.out.println("Greutatea neta a mijlocului de transport este de " + greutate + "Kg");
    }

    public String getTipMijlocDeTransport() {
        return tipMijlocDeTransport;
    }
}
