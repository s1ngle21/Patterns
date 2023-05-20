package factory;

import factory.impl.Chair;
import factory.impl.Furniture;

public class ChairCreator extends FurnitureCreator {

    @Override
    public Furniture createFurnitureObj() {
        return new Chair();
    }
}
