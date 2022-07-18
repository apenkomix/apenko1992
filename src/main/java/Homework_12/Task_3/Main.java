package Homework_12.Task_3;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> count = (x, y) -> x * y;
        Integer result = count.apply(5,9);
        System.out.println(result);
    }
}
