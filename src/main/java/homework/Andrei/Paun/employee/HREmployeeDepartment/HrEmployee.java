package homework.Andrei.Paun.employee.HREmployeeDepartment;

public class HrEmployee {
     public String firstName;

     public String lastName;

     public String cnp;

     public int age;

     public String adress;

     public String position;

     public HrEmployee(){
          position = "HR admin";
     }
public HrEmployee(String firstName, String lastName, String cnp, int age, String address){
          this();
          this.firstName = firstName;
          this.lastName = lastName;
          this.age = age;
          this.adress = address;
          this.cnp = cnp;

}

public String calculSalariu(int salariu, boolean esteImpozitat){
         if (esteImpozitat){
             return String.valueOf(salariu/10);

         }
         return String.valueOf(salariu/25);

}


    public void calculSalariu(int salariu){
        System.out.println(salariu/50);
        System.out.println(this.adress);

}

public double calculSalariu(int salariu, boolean impozit, double cass){
         double newSalary = Double.parseDouble(calculSalariu(salariu, impozit));
         return newSalary/cass;


}

public void modulaOperator(int value){
         System.out.println("rezultat modula operator ternar conditional: " +
                 (value % 4 == 0 ? ""+value+" se imparte la 4 rest 0 " : ""+value+" " +
                         "" + "nu se imparte la 4 rest !=0"));

}

     @Override
     public String toString() {
          return "Date employee: " +
                  "firstName='" + firstName + '\'' +
                  ", lastName='" + lastName + '\'' +
                  ", cnp='" + cnp + '\'' +
                  ", age=" + age +
                  ", adress='" + adress + '\'' +
                  ", position='" + position + '\'';
     }
}

