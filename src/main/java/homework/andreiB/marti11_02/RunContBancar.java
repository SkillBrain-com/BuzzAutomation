package homework.andreiB.marti11_02;

public class RunContBancar {
    public static void main(String[] args) {
        BankAccount cont = new BankAccount("RO099468468435656", 30.00);

        cont.displayInformatiiCont();
        cont.setBalanta(50.325);
        System.out.println("Sold nou: " + cont.getBalanta());
        cont.setBalanta(-23.345);
    }

}
