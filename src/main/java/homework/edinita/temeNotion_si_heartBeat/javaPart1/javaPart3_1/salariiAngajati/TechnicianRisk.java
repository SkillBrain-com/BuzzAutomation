package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_1.salariiAngajati;

public class TechnicianRisk extends Technician implements EmployeeRisk{



    @Override
    public void handleRisk() {
        System.out.println("Lucrez intrun mediu cu risk inalt si beneficiez de un salariu extra (;");
    }

    @Override
    public double calculateSalary() {
        return 2 * refrence + monthlyPremium;
    }

    TechnicianRisk(String firstName, String lastName, int age, String emplomentDate, int reference) {
        super(firstName, lastName, age, emplomentDate, reference);
    }
}
