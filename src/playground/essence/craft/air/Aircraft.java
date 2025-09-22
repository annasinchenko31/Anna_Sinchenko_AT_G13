package playground.essence.craft.air;

import playground.essence.Flyable;
import playground.essence.Matter;
import playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {
    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly(String direction) {
        //System.out.printf("I am %s and I am flying%n", getName());
    }

    @Override
    public int move(int pointA, int pointB) {
       //System.out.printf("%s aircraft is transporting%n", name);
        return pointB - pointA;
    }
}
