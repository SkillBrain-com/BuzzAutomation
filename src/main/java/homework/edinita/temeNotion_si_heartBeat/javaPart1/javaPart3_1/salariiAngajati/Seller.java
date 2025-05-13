package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_1.salariiAngajati;

public class Seller extends Employee {

    private double fixPart = 0.2 * 150;


    @Override
    public double calculateSalary() {
        return fixPart + refrence;
    }

    @Override
    public String getName() {
        return "Vanzatorul se numeste : '" + firstName + "'   '" + lastName + "'";
    }

    Seller(String firstName, String lastName, int age, String emplomentDate, int reference) {
        super(firstName, lastName, age, emplomentDate);
        this. refrence = reference;
    }



}
