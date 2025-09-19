package playground.essence.material;

import playground.essence.Matter;

public class Water extends Matter implements Pourable {
    public Water(int mass) {
        super(mass);
    }

    @Override
    public void pour() {
        //System.out.println("Water is being poured");
    }
}
