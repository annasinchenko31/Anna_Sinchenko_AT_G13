package playground.essence.craft.air;

import playground.essence.Flyable;
import playground.essence.craft.Transportable;

public class Rocket extends Aircraft implements Flyable, Transportable {
    public Rocket(int mass, String name) {
        super(mass, name);
    }
    @Override
    public void fly() {
        //System.out.println(getName() + " is flying!");
    }

    @Override
    public void transport() {
        //System.out.println(getName() + " is transports!");
    }
}
