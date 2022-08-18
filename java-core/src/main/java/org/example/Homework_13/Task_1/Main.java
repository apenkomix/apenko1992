package Homework_13.Task_1;

import javax.sound.sampled.Line;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = List.of("applee", "Mike", "stringg", "Leo", "age");
        List<String> filteredList = myList.stream()
                .filter(string -> string.length() > 5)
                .toList();
        System.out.println(filteredList);
    }
}
