package builder;

import builder.carFeatures.*;

public class Car {
    private final CarType carType;
    private final Brand brand;
    private final Wheel wheels;
    private final Transmission transmission;
    private final String color;
    private final Engine engine;

    public Car(CarType carType, Brand brand, Wheel wheels, Transmission transmission, String color, Engine engine) {
        this.carType = carType;
        this.brand = brand;
        this.wheels = wheels;
        this.transmission = transmission;
        this.color = color;
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public Brand getBrand() {
        return brand;
    }

    public Wheel getWheels() {
        return wheels;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", brand=" + brand +
                ", wheels=" + wheels +
                ", transmission=" + transmission +
                ", color ='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
