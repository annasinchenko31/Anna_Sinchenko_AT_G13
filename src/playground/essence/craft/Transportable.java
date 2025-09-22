package playground.essence.craft;

public interface Transportable {
    String getName();

    void transport();

    default int move(int pointA, int pointB) {
        String className = this.getClass().getSimpleName();
        System.out.printf("I am %s, my name is %s and I am moving from point %d to point %d%n",
                className, getName(), pointA, pointB);
        return pointB - pointA;
    }
}
