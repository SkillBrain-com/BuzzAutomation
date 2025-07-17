package homework.PaulaVasiliu.javabascis3.abstraction;

import javabascis3.abstraction.Shape;

public class Circle extends Shape {


    private double radius;
    private double pi = Math.PI;

    public Circle(double r) {
        this.radius = r;
    }

    // PI * r * r
    @Override
    public double area() {
        return pi * radius * radius;
    }

}
