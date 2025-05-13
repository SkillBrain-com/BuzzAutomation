package homework.edinita.javaPart3.courses.abstraction;

public class    Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Whoff Whoff");
    }

    @Override
    public boolean isHungry() {
        return false;
    }
}
