package homework.edinita.javaPart3.javaPart3_1.salariiAngajatiDEMO_homework;

public class Warehouseman extends Employee{




    @Override
    double calculateSalary() {
        return 65 * refrence;
    }

    @Override
    String getName() {
        return "Angajatul care gestioneaza marguri se numeste : '" + firstName + "'   '" + lastName + "'";
    }


    Warehouseman(String firstName, String lastName, int age, String emplomentDate, int refrence) {
        super(firstName, lastName, age, emplomentDate);
        this. refrence = refrence;
    }



}
