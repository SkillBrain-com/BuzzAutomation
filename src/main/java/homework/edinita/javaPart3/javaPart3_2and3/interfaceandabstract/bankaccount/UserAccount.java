package homework.edinita.javaPart3.javaPart3_2and3.interfaceandabstract.bankaccount;

public class UserAccount implements Account{
    private String nume;
    private String prenume;
    private String adresa;
    private final String cnp;
    private double balance;
    private String iban;

    public UserAccount(String nume, String prenume, String adresa, String cnp, String iban){
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
        this.cnp = cnp;
        this.iban =  iban;
        balance = 0.00;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
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

    public String getCnp() {
        return cnp;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public String createAcount(String nume, String prenume, String adresa) {
        return "Contul s-a completat cu succes si poate fi folosit la orice bancomat pentru orice operatiune bancara";
    }

    @Override
    public String deleteAccount() {
        return "contul a fost sters cu succes ne pare rau pentru finalizare colaborarii";
    }

    @Override
    public String toString() {
        return "User{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", adresa='" + adresa + '\'' +
                ", balance=" + balance +
                '}';
    }
}
