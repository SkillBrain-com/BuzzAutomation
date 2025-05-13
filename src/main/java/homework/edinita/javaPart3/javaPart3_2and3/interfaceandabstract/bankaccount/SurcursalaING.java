package homework.edinita.javaPart3.javaPart3_2and3.interfaceandabstract.bankaccount;

import java.util.List;

public class SurcursalaING {
    public static void main(String[] args) {
        UserAccount userAccount1 = new UserAccount("Zaharia", "Alexandru","Bd Timisoara", "3456789087654356", "ROING0000999994324r2327");
        UserAccount userAccount2 = new UserAccount("Popescu", "Alexandru","Bd Timisoara", "3456789087654356", "ROING0000999994324r2327");
        UserAccount userAccount3 = new UserAccount("Zaharescu", "Alexandru","Bd Timisoara", "3456789087654356", "ROING0000999994324r2327");
        UserAccount userAccount4 = new UserAccount("Georcgescu", "Alexandru","Bd Timisoara", "3456789087654356", "ROING0000999994324r2327");
        UserAccount userAccount5 = new UserAccount("Stancu", "Alexandru","Bd Timisoara", "3456789087654356", "ROING0000999994324r2327");
        UserAccount userAccount6 = new UserAccount("Stan", "Alexandru","Bd Timisoara", "3456789087654356", "ROING0000999994324r2327");
        UserAccount userAccount7 = new UserAccount("Stanicel", "Alexandru","Bd Timisoara", "3456789087654356", "ROING0000999994324r2327");
        BusinessUserAccount businessUserAccount1 = new BusinessUserAccount("UIPATH", "Brasov", "45678765","ROING0000999994324r2327");
        BusinessUserAccount businessUserAccount2 = new BusinessUserAccount("IBM", "Bucuresti", "45678765","ROING0000999994324r2327");
        BusinessUserAccount businessUserAccount3 = new BusinessUserAccount("Luxoft", "Iasi", "45678765","ROING0000999994324r2327");

        List<UserAccount> accountList = List.of(userAccount1, userAccount2, userAccount3, userAccount4, userAccount5, userAccount6, userAccount7);
        clienti(accountList);
        List<BusinessUserAccount> businessUserAccounts = List.of(businessUserAccount1, businessUserAccount2, businessUserAccount3);
        clienti(businessUserAccounts);
    }



    public static <T extends Account> void clienti(List<T> userAccount){
        for(Account account : userAccount){
            System.out.println(account.toString());
        }
    }
}
