package classwork.day1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ThreeTask {
    static void main() {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            myList1.add("мама" + i);
        }

        for (int i = 0; i < 10000; i++) {
            myList2.add("мама" + i);
        }

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < myList1.size(); i++) {
            myList1.get(i);
        }

        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();
        for (int i = 0; i < myList2.size(); i++) {
            myList2.get(i);
        }
        System.out.println(System.currentTimeMillis() - t0);
    }
}
