package playground.essence.material;

import playground.essence.Matter;

public class Diesel extends Matter implements Pourable, Powerable {
    public Diesel(int mass) {
        super(mass);
    }

    @Override
    public void pour() {
        //System.out.println("Diesel is being poured");
    }

    @Override
    public void power() {
        //System.out.println("Diesel powers the engine");
    }
}