package strategy.impl;

public class CountTriangleSquare implements SquareCountStrategy {
    @Override
    public double calcSquare(double high, double side) {
        return 0.5 * side * high;
    }
}
