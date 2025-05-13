package homework.edinita.javaPart3.javaPart3_1;

public class BankAccount {
    private String accountNumber;
    private float balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountNumber("5010385584");
        account.setBalance(99999);
    }
}
