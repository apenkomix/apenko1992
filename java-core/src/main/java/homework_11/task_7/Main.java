package homework_11.task_7;

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
