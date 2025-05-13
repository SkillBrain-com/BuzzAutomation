package homework.edinita.all4principlesofOOP;

public class Circle extends Shape{
    private double radius;
    private double pi = Math.PI;

    public Circle(double r) {
        this.radius = r;
    }

    //runtime polymorphism
    @Override
    public double area() {
        return pi*radius*radius;
    }
}
