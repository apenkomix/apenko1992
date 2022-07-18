package Homework_11.Task_7;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 20; i++) {
            treeSet.add(i + 1);
        }
        System.out.println(treeSet.descendingSet());
    }
}
