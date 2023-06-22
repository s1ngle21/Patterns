package strategy;

import strategy.impl.CountRectangleSquare;
import strategy.impl.CountTriangleSquare;

import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Context context = new Context(new CountRectangleSquare());
        Rectangle rectangle = new Rectangle(15.6, 17.8);
        double rectangleSquare = context.executeStrategy(rectangle.getSideA(), rectangle.getSideB());
        LOGGER.info("Rectangle square is:" + rectangleSquare);

        Context context1 = new Context(new CountTriangleSquare());
        Triangle triangle = new Triangle(12.5, 7);
        double triangleSquare = context1.executeStrategy(triangle.getHigh(), triangle.getSide());
        LOGGER.info("Triangle square is:" + triangleSquare);
    }
}
