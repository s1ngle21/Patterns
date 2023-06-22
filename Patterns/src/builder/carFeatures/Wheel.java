package builder.carFeatures;

public class Wheel {
    private final double diameter;

    public Wheel(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                '}';
    }
}
