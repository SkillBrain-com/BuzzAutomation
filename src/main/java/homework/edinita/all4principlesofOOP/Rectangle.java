package homework.edinita.all4principlesofOOP;

public class Rectangle extends Shape {
    private double l1;
    private double l2;

    public Rectangle(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
    }
    @Override
    public double area() {
        return l1 * l2;
    }
    //Overload
    public double area(double l1){
        return l1 * 10;
    }
    //Overload
    public double area(double l1, double l2){
        return l1 * l2 *  10;
    }
    //Overload
    public double area(double l1, double l2, double l3){
        return l1 * l2 * l3;
    }
}
