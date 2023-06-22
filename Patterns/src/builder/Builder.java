package builder;

import builder.carFeatures.*;

public interface Builder {
    void setWheels(Wheel wheels);
    void setEngine(Engine engine);
    void setCarType(CarType carType);
    void setTransmission(Transmission transmission);
    void setBrand(Brand brand);
    void setColor(String string);
}
