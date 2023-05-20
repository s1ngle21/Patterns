package builder;

import builder.carFeatures.*;

public class CarBuilder implements Builder {

    private Wheel wheels;
    private Engine engine;
    private CarType carType;
    private Transmission transmission;
    private Brand brand;
    private String string;

    @Override
    public void setWheels(Wheel wheels) {
        this.wheels = wheels;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void setColor(String string) {
        this.string = string;
    }
    public Car getResultCar() {
        return new Car(carType, brand, wheels, transmission, string, engine);
    }
}
