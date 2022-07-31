package homework_13.task_1;

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
