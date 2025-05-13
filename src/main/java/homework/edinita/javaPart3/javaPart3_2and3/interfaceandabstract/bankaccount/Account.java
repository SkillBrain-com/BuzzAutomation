package homework.edinita.javaPart3.javaPart3_2and3.interfaceandabstract.bankaccount;

public interface Account {
    String bankName = "ING";
    String countryName = "Romania";

    String createAcount(String nume, String prenume, String adresa);
    String deleteAccount();

}
