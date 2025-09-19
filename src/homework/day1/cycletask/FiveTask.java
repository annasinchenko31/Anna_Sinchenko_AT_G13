package homework.day1.cycletask;

public class FiveTask {
    public void printFiveTask() {
        int[] array = {2, 4, 6, 8, 9, 10};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
