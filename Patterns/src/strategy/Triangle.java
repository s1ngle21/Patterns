package strategy;

public class Triangle {
    private double side;
    private double high;

    public Triangle(double side, double high) {
        this.side = side;
        this.high = high;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
