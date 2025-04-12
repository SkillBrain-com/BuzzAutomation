package Javabasics3;

public class Person extends Object{

    static String name;
    String surname;
    int age;
    char gender;

    // scope = vizibilitatea variabilei

    boolean definePerson() {
        name = "Mihai";
        surname = "Cosmin";
        age = 35;
        gender = 'm';
        return true;
    }


    void sayHello() {
        System.out.println("Hello" + name);
    }

    // first - class then - object
    // class -> static
    // object -> non-static
    // 1. class -> 2. object

    static String getNamem() {
        return name;
    }

    public static void main(String[] args) {
//        Person p = new Person();
//        p.age = 31;
//        p.name = "Mihai";
//        p.sayHello();
//        System.out.println(p.age);
//        System.out.println(p.name);
//        System.out.println(p.surname);
//        p = null;
//        p.sayHello();
        Person object = new Person();
        object.sayHello();

    }


}
