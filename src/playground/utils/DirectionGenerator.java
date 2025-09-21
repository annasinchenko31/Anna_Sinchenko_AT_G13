package playground.utils;

import java.util.concurrent.ThreadLocalRandom;

public class DirectionGenerator {
    public static String generateDirection() {
        int num = ThreadLocalRandom.current().nextInt(1,40);

        if (num >= 1 && num <= 9) {
            return "NORTH";
        } else if (num >= 10 && num <= 19) {
            return "SOUTH";
        } else if (num >= 20 && num <= 29) {
            return "WEST";
        } else {
            return "EAST";
        }
    }
}
