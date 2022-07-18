package Homework_11.Task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integerArrayList.add(0, i);
        }
        Iterator<Integer> iterator = integerArrayList.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(integerArrayList);
    }
}