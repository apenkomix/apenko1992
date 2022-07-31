package homework_12.task_2;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> convert = i -> String.valueOf(i);
        System.out.println(convert.apply(67) + "PLN");
    }
}