package Homework_13.Task_4;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 15, 25, 56, 78);
        Optional<Integer> integerList = list.stream().filter(x -> x > 22)
                .findFirst();
        System.out.println(integerList);
    }
}
