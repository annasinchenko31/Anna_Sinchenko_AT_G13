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

    @Override
    public int move(int pointA, int pointB) {
        System.out.printf("I am %s, my name is %s and I am moving from point %d to point %d%n",
                this.getClass().getSimpleName(), getName(), pointA, pointB);
        return pointB - pointA;
    }
}
