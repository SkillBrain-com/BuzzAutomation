package homework.edinita.javaPart3.javaPart3_1.salariiAngajatiDEMO_homework;

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
