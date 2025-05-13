package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_1.salariiAngajati;

public class Technician extends Employee{


    @Override
    public double calculateSalary() {
        return 2 * refrence;
    }

    @Override
    public String getName() {
        return "Tecnicianu se numeste : '" + firstName + "'   '" + lastName + "'";
    }

    Technician(String firstName, String lastName, int age, String emplomentDate, int reference) {
        super(firstName, lastName, age, emplomentDate);
        this. refrence = reference;
    }
}
