package strategy;

import strategy.impl.SquareCountStrategy;

public class Context {
    private SquareCountStrategy squareCountStrategy;

    public Context(SquareCountStrategy squareCountStrategy) {
        this.squareCountStrategy = squareCountStrategy;
    }

    public double executeStrategy(double valueA, double valueB) {
        return squareCountStrategy.calcSquare(valueA, valueB);
    }
}
