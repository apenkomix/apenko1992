package homework_13.task_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = List.of("applee", "Mike", "stringg", "Leo", "age");
        System.out.println(myList.stream().max(String::compareTo));
    }
}
