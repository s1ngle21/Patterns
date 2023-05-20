package factory;

import factory.impl.Bed;
import factory.impl.Furniture;

public class BedCreator extends FurnitureCreator{
    @Override
    public Furniture createFurnitureObj() {
        return new Bed();
    }
}
