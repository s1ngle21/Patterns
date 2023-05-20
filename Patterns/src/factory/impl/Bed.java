package factory.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Bed implements Furniture {
    Logger LOGGER = Logger.getLogger(Furniture.class.getName());
    @Override
    public void create() {
        LOGGER.log(Level.INFO, "Bed was created");
    }
}
