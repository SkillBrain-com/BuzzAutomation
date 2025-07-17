package homework.PaulaVasiliu.javabascis3.abstraction;

import javabascis3.abstraction.Shape;

public class Square extends Shape {


    @Override
    public double area() {
        double l = 10.50;
        return l * l;
    }
}
