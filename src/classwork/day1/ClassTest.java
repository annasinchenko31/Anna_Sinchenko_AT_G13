package classwork.day1;

import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String incoming = scanner.nextLine();
            if (incoming.equalsIgnoreCase("test")) {
                break;
            }
            System.out.printf("Just got '%s' text!", incoming);
        }
    }
}
