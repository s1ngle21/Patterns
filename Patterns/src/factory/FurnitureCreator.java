package factory;

import factory.impl.Furniture;

public abstract class FurnitureCreator {

    public void createFurniture() {
        Furniture furniture = create();
    }
    protected abstract Furniture create();
}
