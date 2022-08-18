package Homework_13.Task_5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,4,5,6,7,8,9,0);
        Integer multiplication = list.stream()
                .limit(5)
                .reduce(1, (x,y)-> x * y);
        System.out.println(multiplication);
    }
}
