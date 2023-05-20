package builder;

import builder.carFeatures.*;

public class Director {
    public void createCoupeCar(Builder builder) {
        builder.setCarType(CarType.COUPE);
        builder.setBrand(Brand.MAZDA);
        builder.setWheels(new Wheel(2));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setColor("Red");
        builder.setEngine(new Engine(1.8, "Gasoline"));
    }

    public void createSedanCar(Builder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setBrand(Brand.LEXUS);
        builder.setWheels(new Wheel(1.9));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setColor("White");
        builder.setEngine(new Engine(2.4, "Diesel"));
    }

    public void createHatchbackCar(Builder builder) {
        builder.setCarType(CarType.HATCHBACK);
        builder.setBrand(Brand.HONDA);
        builder.setWheels(new Wheel(2.5));
        builder.setTransmission(Transmission.MANUAL);
        builder.setColor("Black");
        builder.setEngine(new Engine(2.2, "Gas"));
    }
}
