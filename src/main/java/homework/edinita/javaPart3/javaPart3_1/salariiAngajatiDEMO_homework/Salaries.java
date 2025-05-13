package homework.edinita.javaPart3.javaPart3_1.salariiAngajatiDEMO_homework;

import java.util.Scanner;

public class Salaries {
    public static void main(String[] args) {
        Stuff stuff = new Stuff();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti salariul minim pe economie in lei : ");





        while(!scanner.hasNextInt()) {
            System.out.println("Valaroare introdusa nu e un INT, mai incearca odata.");
        }
        int salariuMinim = scanner.nextInt();






        System.out.println("Introduceti salariul mediu pe economie in lei.");
        while(!scanner.hasNextInt()) {
            System.out.println("Valaroare introdusa nu e un INT, mai incearca odata.");
        }
        int salariuMediu = scanner.nextInt();




        int salariulMinimPeOra = salariuMinim / 160;
        int salariulMediuPeOra = salariuMediu / 160;

        stuff.addEmployee(new Seller("Alina", "Bostan", 32, "1995", salariuMinim));
        stuff.addEmployee(new Technician("Leo", "Sterp", 22, "2006", salariuMediu));
        stuff.addEmployee(new Warehouseman("Cosmo", "Naut", 35, "2015", salariulMinimPeOra));
        stuff.addEmployee(new TechnicianRisk("Na", "Na", 32, "2003", salariulMediuPeOra));
        stuff.addEmployee(new HandlingRisk("Ma", "Rus", 42, "2003", salariulMediuPeOra));



        stuff.showSalaries();
        System.out.println("Salariul mediiu in companie este :  '" + stuff.averageSalary() + "', in lei");
    }
}
