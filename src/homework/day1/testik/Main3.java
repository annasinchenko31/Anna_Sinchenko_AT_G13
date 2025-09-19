package homework.day1.testik;

public class Main3 {

    public static void main(String... args) {
        Human slava = null;

        slava = new Human();
        System.out.println(slava.age);

        slava.age = 12;
        System.out.println(slava.age);

        Human max = new Human();
        max.age = 13;
        max.name = "Max";
        System.out.println(max.age);
        System.out.println(max.age);
    }

}
