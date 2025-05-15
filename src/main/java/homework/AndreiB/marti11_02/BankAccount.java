package homework.AndreiB.marti11_02;

public class BankAccount {
    private String numarCont;
    private double balanta;




    public BankAccount(String numarCont, double balanta) {
        this.numarCont = numarCont;
        this.balanta = balanta;
    }

    public String getNumarCont() {
        return numarCont;
    }

    public double getBalanta() {
        return balanta;
    }

    public void setBalanta(String numarCont) {
        this.numarCont = numarCont;
    }

    public void setBalanta(double balanta) {
        if (balanta >= 0) {
        }

    }


    public void displayInformatiiCont() {
        System.out.println("Numar cont : " + numarCont);
        System.out.println("Sold: " + balanta);
    }
}
