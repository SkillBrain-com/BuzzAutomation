package homework.Marco.Java3.Exemples;

public class Employee extends Person {

    private static int employees;


    public Employee(){
        employees++;
    }

    {
        name = "cristian";
    }

    {
        age = 32;
    }

    {
        hasWorkedExperience = true;
    }

    static{
        employees =0;
    }


    String name;
    String surname;
    int id;
    int absence;
    int age;
    String adress;
    boolean hasWorkedExperience;

    public static int getEmployees() {
        return employees;
    }
}
