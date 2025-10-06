package classwork.day1;

import java.util.ArrayList;
import java.util.List;

public class TwoTask {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        String text = "мама мыла раму мыла";

        String[] words = text.split(" ");

        for (String word : words) {
            myList.add(word);
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        for (String word : myList) {
            System.out.println(word);
        }
    }
}
