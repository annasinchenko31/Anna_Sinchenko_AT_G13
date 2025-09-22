package playground.utils;

import java.util.concurrent.ThreadLocalRandom;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        int value = ThreadLocalRandom.current().nextInt(1,80);

        System.out.printf("CoordinatesGenerator: I have generated point with value: %d%n", value);

        return value;
    }
}