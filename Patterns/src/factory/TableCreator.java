package factory;

import factory.impl.Furniture;
import factory.impl.Table;

public class TableCreator extends FurnitureCreator {

    @Override
    public Furniture createFurnitureObj() {
        return new Table();
    }
}
