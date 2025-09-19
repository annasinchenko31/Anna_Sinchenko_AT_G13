package playground.essence.material;

import playground.essence.Matter;

public class Petrol extends Matter implements Pourable, Powerable {
    public Petrol(int mass) {
        super(mass);
    }

    @Override
    public void pour() {
        //System.out.println("Petrol is being poured");
    }

    @Override
    public void power() {
        //System.out.println("Petrol powers the engine");
    }
}
