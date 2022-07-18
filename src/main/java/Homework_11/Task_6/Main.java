package Homework_11.Task_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayNumbers = new ArrayList<>();
        int arrayLength = 100_000;
        for (int i = 0; i < arrayLength; i++) {
            arrayNumbers.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < arrayLength; i++) {
            arrayNumbers.remove(0);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList time = " + (end - start));

        List<Integer> linkedListNumbers = new LinkedList<>();
        for (int i = 0; i < arrayLength; i++) {
            linkedListNumbers.add(i);
        }
        start = System.currentTimeMillis();
        for (int i = 0; i < arrayLength; i++) {
            linkedListNumbers.remove(0);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList time = " + (end - start));
    }
}


