package factory;

import factory.impl.Furniture;

public class Main {
    public static void main(String[] args) {
        FurnitureCreator tableCreator = new TableCreator();
        tableCreator.createFurniture();

        FurnitureCreator chairCreator = new ChairCreator();
        chairCreator.createFurniture();

        FurnitureCreator bedCreator = new BedCreator();
        bedCreator.createFurniture();
    }
}
