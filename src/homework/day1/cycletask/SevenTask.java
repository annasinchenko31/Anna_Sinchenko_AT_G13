package homework.day1.cycletask;

public class SevenTask {
    public void printSevenTask() {
        int[] array = {2, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            int y = array[i] * array[i];
            System.out.print(y + " ");
        }
    }
}

