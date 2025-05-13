package homework.edinita.temeNotion_si_heartBeat.javaPart1.all4principlesofOOP;

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
