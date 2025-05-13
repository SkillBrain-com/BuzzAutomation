package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_1.salariiAngajati;

public class HandlingRisk extends  Warehouseman implements EmployeeRisk{


    @Override
    public void handleRisk() {
        System.out.println("Gestionez marfuri care implica un risk inalt si beneficiez de un spor extra (;");
    }

    @Override
    public double calculateSalary() {
        return 65 * refrence + monthlyPremium;
    }


    HandlingRisk(String firstName, String lastName, int age, String emplomentDate, int refrence) {
        super(firstName, lastName, age, emplomentDate, refrence);
        this. refrence = refrence;
    }
}
