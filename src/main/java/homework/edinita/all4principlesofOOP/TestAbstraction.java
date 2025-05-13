package homework.edinita.all4principlesofOOP;

public class TestAbstraction {
    public static void main(String[] args) {
        Shape square = new Square();
        double squareArea = square.area();
        System.out.println(squareArea + "\n");
        System.out.println("========================================\n");
        Shape rectangle = new Rectangle(5.5, 10.1);
        double rectangleArea = rectangle.area();
        System.out.println(rectangleArea);
        System.out.println("========================================\n");
        Shape circle = new Circle(5.5);
        double circleArea = circle.area();
        System.out.println(circleArea);
        System.out.println("========================================\n");
        Rectangle rectangle1 = new Rectangle(5.5, 10.1);
        System.out.println(rectangle1.area(5.5));
        System.out.println(rectangle1.area(10.1, 100));
        System.out.println(rectangle1.area(5.5, 10.1, 32));
    }
}
