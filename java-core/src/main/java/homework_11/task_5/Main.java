package homework_11.task_5;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayNumbers = new ArrayList<>();
        int arrayLength = 100_000;
        for (Integer i = 0; i < arrayLength; i++) {
            arrayNumbers.add(i);
        }
        long start = System.currentTimeMillis();
        for (Integer i = 0; i < arrayLength; i++) {
            arrayNumbers.remove(arrayNumbers.size() / 2);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList time = " + (end - start));

        List<Integer> linkedListNumbers = new LinkedList<>();
        for (Integer i = 0; i < arrayLength; i++) {
            linkedListNumbers.add(i);
        }
        start = System.currentTimeMillis();
        for (Integer i = 0; i < arrayLength; i++) {
            linkedListNumbers.remove(linkedListNumbers.size() / 2);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList time = " + (end - start));
    }
}

