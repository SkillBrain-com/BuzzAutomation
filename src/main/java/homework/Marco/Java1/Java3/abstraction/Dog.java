package Java3.abstraction;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Whoof Whoof");
    }

    @Override
    public boolean isHungry() {
        return false;
    }
}
