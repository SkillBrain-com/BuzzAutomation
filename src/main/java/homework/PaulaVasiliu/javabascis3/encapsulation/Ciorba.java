package homework.PaulaVasiliu.javabascis3.encapsulation;

public class Ciorba {

    private static int corbePeZi = 0;
    private int apa;
    private String mirodenii;
    private String legume;
    private boolean areCarne;
    private boolean esteCalda;

    public static int getCorbePeZi() {
        return corbePeZi;
    }


    // default constructor || no-arg constructor
    public Ciorba() {
        System.out.println("Default constructor was called!");
        corbePeZi++;
    }
    //     Ciorba(boolean, String)
    // constructor chaining
    public Ciorba(boolean areCarne, String legume) {
        this();
        this.areCarne = areCarne;
        this.legume = legume;

    }

    public Ciorba(String mirodenii) {
        this(true, "morcovi");
        this.mirodenii = mirodenii;
    }

    public int getApa() {
        return apa;
    }

    public void setApa(int apa) {
        this.apa = apa;
    }

    public String getMirodenii() {
        return mirodenii;
    }

    public void setMirodenii(String mirodenii) {
        this.mirodenii = mirodenii;
    }

    public String getLegume() {
        return legume;
    }

    public void setLegume(String legume) {
        this.legume = legume;
    }

    public boolean isAreCarne() {
        return areCarne;
    }

    public void setAreCarne(boolean areCarne) {
        this.areCarne = areCarne;
    }

    public boolean isEsteCalda() {
        return esteCalda;
    }

    public void setEsteCalda(boolean esteCalda) {
        this.esteCalda = esteCalda;
    }
}
