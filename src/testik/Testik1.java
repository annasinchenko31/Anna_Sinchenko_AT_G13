package testik;

import java.util.Random;

public class Testik1 {
    public void testikOne() {
        int i = 0;
        while (i < 21) {
            System.out.print(i + " ");
            i++;
        }
    }

    public void testikTwo() {
        for (int b = 3; b < 20; b++) {
            if (b % 2 != 0) {
                System.out.print(b + " ");
            }
        }
    }

    public void testikThree() {
        int[] array = new int[7];
        Random random = new Random();

        for (int c = 0; c < array.length; c++) {
            array[c] = random.nextInt(50);
            System.out.print(array[c] + " ");
        }

    }

    public void testikFour() {
        int[] array = {1, 3, 5, 7, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void testikFive() {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }


    }
}
