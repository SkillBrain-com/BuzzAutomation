package Java3.abstraction;

public class Circle extends Shape{


    private double radius;
    private double pi = Math.PI;

    public Circle(double r) {
        this.radius = r;
    }

    public double area() {
        return pi * radius * radius;
    }
}
