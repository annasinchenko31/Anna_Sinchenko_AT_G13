package playground.essence.creatures;

public abstract class Vertebrata extends Animal {
    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    public void eat(Insect food) {
        String result = String.format("I am %s and I am eating %s", this.name, food.getName());
        System.out.println(result);
        //System.out.printf("I am %s and I am eating %s%n", getName(), food.getName());
}



}
