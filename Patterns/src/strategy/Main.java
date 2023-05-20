package strategy;

import strategy.impl.CountRectangleSquare;
import strategy.impl.CountTriangleSquare;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new CountRectangleSquare());
        Rectangle rectangle = new Rectangle(15.6, 17.8);
        double rectangleSquare = context.executeStrategy(rectangle.getSideA(), rectangle.getSideB());
        System.out.println(rectangleSquare);

        Context context1 = new Context(new CountTriangleSquare());
        Triangle triangle = new Triangle(12.5, 7);
        double triangleSquare = context1.executeStrategy(triangle.getHigh(), triangle.getSide());
        System.out.println(triangleSquare);
    }
}
