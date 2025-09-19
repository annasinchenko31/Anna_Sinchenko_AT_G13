package playground.essence.craft.hand;

public class Bottle extends Container implements Storable {
    public Bottle(int mass, String name) {
        super(mass,name);
    }

    @Override
    public void store() {
        //System.out.printf("Bottle %s stores liquid%n", getName());
    }
}
