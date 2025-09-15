package cycletask;

public class NineTask {
    public void printNineTask() {
        int[] array = {1, 2, 3, 4, 5};
        int b = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = b;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
