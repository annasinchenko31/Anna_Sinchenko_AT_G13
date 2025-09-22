package playground.essence.craft.field;

import playground.essence.craft.Rideable;
import playground.essence.craft.Transportable;

public class Car extends Vehicle implements Transportable, Rideable {
    public Car(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void transport() {
        System.out.println(getName() + " is transports.");
    }


    @Override
    public int move(int pointA, int pointB) {
        String className = this.getClass().getSimpleName();
        System.out.printf("I am %s, my name is %s and I am moving from point %d to point %d%n",
                className, getName(), pointA, pointB);
        return pointB - pointA;
    }

    @Override
    public void ride() {
        System.out.println(getName() + " is riding.");
    }
}



