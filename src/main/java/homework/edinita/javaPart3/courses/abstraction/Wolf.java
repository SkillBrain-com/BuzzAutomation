package homework.edinita.javaPart3.courses.abstraction;

public class Wolf extends Animal implements WildAnimal, Flyable{

    @Override
    public void doSomething() {
        System.out.println("Doing something from wolf...");
    }

    @Override
    public void makeSound() {
        System.out.println("Whoooooooo");
    }

    @Override
    public void hunt() {
        System.out.println("Hunting in packs");
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
