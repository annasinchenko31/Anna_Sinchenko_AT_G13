package playground.essence.creatures;

public class Beetle extends Insect {

    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        if (this.getMass() < home.getMass()) {
            int carrotPerBeetle = home.getMass() / this.getMass();
            System.out.println("I am %s and I will nest there with %d my family members!", this.getName(), carrotPerBeetle);
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}
