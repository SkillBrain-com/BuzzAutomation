package homework.edinita.javaPart3.javaPart3_1;

public class Employee {
    private int employee_id;
    private String employee_name;
    private float employee_salary;

    public int getEmployee_id() {
        return employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public String getEmployee_salary() {
        return String.valueOf(employee_salary);
    }


    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }



    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public void setEmployee_salary(float employee_salary) {
        this.employee_salary = employee_salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", employee_salary=" + employee_salary +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee();

        System.out.println(employee);
    }
}
