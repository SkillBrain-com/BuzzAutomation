package homework.PaulaVasiliu.javabascis3;

import javabascis3.Person;

public class Employee extends Person {

    private static int employees;

    public Employee() {
        employees++;
    }

    {
        name = "cristian";
    }

    {
        age = 32;
    }

    {
        hasWorkExperience = true;
    }

    static {
        employees = 0;
    }


    public String name;
    private String surname;
    protected int id;
    int absence;
    int age;
    String address;
    boolean hasWorkExperience;

    public static int getEmployees() {
        return employees;
    }

}
