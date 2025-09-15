package cycletask;

public class EightTask {
    public void printEightTask () {
        int[] array = {2, 7, 10, 9, 5};
        int min  = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print(min + " ");
    }
}
