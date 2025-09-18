package playground.essence.creatures;

public abstract class Vertebrata extends Animal {

    public void eat(Insect food) {

        String result = String.format("I am %s and I am eating %s", this.name, food.getName());
        System.out.println(result);
}



}
