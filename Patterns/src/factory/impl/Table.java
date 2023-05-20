package factory.impl;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Table implements Furniture {
    Logger LOGGER = Logger.getLogger(Furniture.class.getName());
    @Override
    public void create() {
        LOGGER.log(Level.INFO, "Table was created");
    }
}
