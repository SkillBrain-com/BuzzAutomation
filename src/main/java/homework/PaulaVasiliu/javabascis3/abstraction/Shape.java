package homework.PaulaVasiliu.javabascis3.abstraction;

public abstract class Shape {

    public Shape() {
        System.out.println("Calling constructor..");
    }

    public abstract double area();


    public void drawShape() {
        System.out.println("Drawing shape...");
    }

}
