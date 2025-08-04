package homework.Marco.Java3.Exemples;

public class Person {

    public Person(){
        this.name = "Gigel";
        this.age = 20;
        this.gender = 'M';
        System.out.println("Hello from first constructor");
    }

    public Person(String surname, String adress ) {
       this();
       this.surname = surname;
       this.adress = adress;

        System.out.println("Hello from second constructor");
    }

    public Person(int randomNumber) {
        this("Claudiu", "Strada Sperantei nr.13");
        System.out.println("Hello from third constructor! Your number is " + randomNumber);
    }




    String name;
    String surname;
    int age;
    char gender;
    String adress;

     // scope?
    boolean definePerson() {
        name = "Marco";
        surname = "Rabita";
        age = 15;
        gender = 'M';
        return true;
    }

    static void sayHello() {
        System.out.println("Hello from Person");
    }


    String getName() {
        return name;
    }


}

