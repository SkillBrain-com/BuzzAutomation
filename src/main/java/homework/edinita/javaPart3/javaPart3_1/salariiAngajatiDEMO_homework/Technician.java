package homework.edinita.javaPart3.javaPart3_1.salariiAngajatiDEMO_homework;

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
