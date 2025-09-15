package testik;

public class Foo {
    public static void main(String[] args) {
        foo();
    }

    static void foo() {
        int e = 0;
        for (int i = 23; i <= 28; i++) {
            if (i % 13 == 0) {
                System.out.println("continue!");
                break;
            }
            e = i;
            System.out.println("i is : " + i);
        }
        System.out.println("number is : " + e);
    }
}
