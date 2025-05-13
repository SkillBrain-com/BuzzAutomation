package homework.edinita.javaPart3.courses;

public class Person {

    public Person() {
        this.name = "Gigel";
        this.age = 20;
        this.gender = 'M';
        System.out.println("Hello from first constructor!");
    }

    public Person(String surname, String address) {
        this();
        this.surname = surname;
        this.address = address;
        System.out.println("Hello from second constructor!");
    }

    public Person(int randomNumber) {
        this("Claudiu", "Strada sperantei nr.13");
        System.out.println("Hello from third constructor! Your number is " + randomNumber);
    }


    String name;
    String surname;
    int age;
    char gender;
    String address;

    boolean definePerson() {
        name = "Mihai";
        surname = "Cosmin";
        age = 35;
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


