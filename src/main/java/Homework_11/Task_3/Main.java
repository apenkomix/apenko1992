package Homework_11.Task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integerArrayList.add(0, i);
        }
        List<Integer> secondintegerArrayList = new ArrayList<>();
        for (int i = 0; i < 90; i++) {
            secondintegerArrayList.add(0, i);
        }
        integerArrayList.removeAll(secondintegerArrayList);
        System.out.println(integerArrayList);
    }
}