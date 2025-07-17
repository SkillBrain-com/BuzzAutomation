package homework.PaulaVasiliu.javabascis3.abstraction;

import javabascis3.abstraction.Animal;
import javabascis3.abstraction.Flyable;
import javabascis3.abstraction.WildAnimal;

public class Wolf extends Animal implements WildAnimal, Flyable {

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
