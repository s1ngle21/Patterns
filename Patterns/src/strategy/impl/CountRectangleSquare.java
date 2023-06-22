package strategy.impl;

public class CountRectangleSquare implements SquareCountStrategy {
    @Override
    public double calcSquare(double sideA, double sideB) {
        return sideA * sideB;
    }
}
