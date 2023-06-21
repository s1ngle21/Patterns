package builder.carFeatures;

public class Engine {
    private final double volume;
    private final String fuelType;

    public Engine(double volume, String fuelType) {
        this.volume = volume;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
