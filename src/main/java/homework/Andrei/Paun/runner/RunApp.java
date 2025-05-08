package homework.Andrei.Paun.runner;


import homework.Andrei.Paun.employee.HREmployeeDepartment.HrEmployee;

public class RunApp {
    public static void main(String[] args) {
        HrEmployee employee = new HrEmployee();
        HrEmployee employee1 = new HrEmployee("Paun", "Andrei", "457876543567898", 29, "Orhei");

        System.out.println(employee);
        System.out.println(employee1);

        System.out.println("----------------------------------------------");


        System.out.println(employee1.calculSalariu(12000, true));
        System.out.println(employee1.calculSalariu(12000, false, 15));
        employee1.calculSalariu(20000);

        employee1.modulaOperator(100);
        employee.modulaOperator(75);
    }
}
