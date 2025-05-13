package homework.edinita.javaPart3.javaPart3_2and3.interfaceandabstract.bankaccount;

public class BusinessUserAccount implements Account{
    private String businessNAme;
    private String adresa;
    private final String cui;
    private double balance;
    private String iban;

    public BusinessUserAccount(String nume, String adresa, String cui, String iban){
        this.businessNAme = nume;
        this.adresa = adresa;
        this.cui = cui;
        this.iban =  iban;
        balance = 0.00;
    }

    public String getNume() {
        return businessNAme;
    }

    public void setNume(String nume) {
        this.businessNAme = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCui() {
        return cui;
    }

    public String getIban() {
        return iban;
    }
    @Override
    public String createAcount(String nume, String prenume, String adresa) {
        return null;
    }

    @Override
    public String deleteAccount() {
        return null;
    }

    @Override
    public String toString() {
        return "BusinessUser{" +
                "businessNAme='" + businessNAme + '\'' +
                ", adresa='" + adresa + '\'' +
                ", cui='" + cui + '\'' +
                ", balance=" + balance +
                ", iban='" + iban + '\'' +
                '}';
    }
}
