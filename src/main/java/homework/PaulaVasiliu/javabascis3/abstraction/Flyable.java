package homework.PaulaVasiliu.javabascis3.abstraction;

public interface Flyable {

    public abstract boolean canFly();

    public static void doSomethingFromInterface() {
        System.out.println("Doing something....");
    }

    default void doSomething() {
        System.out.println("doing something from an interface...");
    }

}
