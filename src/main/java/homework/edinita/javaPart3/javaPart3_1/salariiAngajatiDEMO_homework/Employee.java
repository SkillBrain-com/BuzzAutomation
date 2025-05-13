package homework.edinita.javaPart3.javaPart3_1.salariiAngajatiDEMO_homework;

public abstract class Employee {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected String emplomentDate;
    protected int refrence;



    abstract double calculateSalary();

    abstract String getName();

    Employee(String firstName, String lastName, int age, String emplomentDate) {
        this. firstName = firstName;
        this. lastName = lastName;
        this. age = age;
        this. emplomentDate = emplomentDate;
    }




    //command + n -getter- si selectezi fiecare var

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmplomentDate() {
        return emplomentDate;
    }

    public int getRefrence() {
        return refrence;
    }




    // command + n -setter- si selectezi fiecare var || functii cu parametru pt a modifica o var restrictiva
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmplomentDate(String emplomentDate) {
        this.emplomentDate = emplomentDate;
    }

    public void setRefrence(int refrence) {
        this.refrence = refrence;
    }
}
