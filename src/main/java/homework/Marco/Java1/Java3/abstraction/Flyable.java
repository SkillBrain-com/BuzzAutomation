package Java3.abstraction;

public interface Flyable {

    boolean canFly();

    default void doSomething() {
        System.out.println("Doing something from an interface...");
    }
}
