package cycletask;

public class TenTask {
    public void printTenTask () {
        int[] array = {5, 1, 9, 3, 2, 8, 6};

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("TenTask: ");
        for (int y = 0; y < array.length; y++) {
            System.out.print(array[y] + " ");
            }
        }
    }
