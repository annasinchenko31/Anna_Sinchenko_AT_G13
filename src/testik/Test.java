package testik;

public class Test {
    public static int sum = 0;
    public static int i = 0;

    public static void main(String[] args) {
        while (i < 10) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.print("sum = " + sum);
    }
}