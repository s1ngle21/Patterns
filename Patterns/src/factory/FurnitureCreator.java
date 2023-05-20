package factory;

import factory.impl.Furniture;

public abstract class FurnitureCreator {

    public void createFurniture() {
        Furniture furniture = createFurnitureObj();
        furniture.create();
    }
    public abstract Furniture createFurnitureObj();
}
