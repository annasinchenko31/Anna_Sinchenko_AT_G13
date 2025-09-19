package playground.essence.craft.field;

import playground.essence.craft.Rideable;
import playground.essence.craft.Transportable;

public class Moped extends Vehicle implements Transportable, Rideable {
    public Moped(int mass, String name) {
        super(mass, name);
    }
    @Override
    public void transport() {
        System.out.println(getName() + " is transports!");
    }

    @Override
    public void ride() {
        System.out.println(getName() + " is riding!");
    }
}
