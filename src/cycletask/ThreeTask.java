package cycletask;

import java.util.Random;

public class ThreeTask {
    public void printThreeTask() {
        int[] array = new int[7];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
    }
}