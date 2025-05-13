package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_1.salariiAngajati;

import java.util.ArrayList;

public class Stuff {

    ArrayList<Employee> employeeList;

    Stuff() {
        employeeList = new ArrayList<>();
    }



    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }



    public void showSalaries() {
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + ", care castiga: '" + employee.calculateSalary() + "', in lei.");
        }
    }


    public double averageSalary() {
        int employeeNumber = 0;
        double allSalary = 0;

        while(employeeNumber < employeeList.size()) {
            allSalary += employeeList.get(employeeNumber).calculateSalary();
            employeeNumber++;
        }
        return allSalary / employeeList.size(); //salariul mediu
    }
}
