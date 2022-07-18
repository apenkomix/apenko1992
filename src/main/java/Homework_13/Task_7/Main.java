package Homework_13.Task_7;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Apple",1000),
                new Phone("Sumsung", 800),
                new Phone("Xiomi", 850));
        List<Phone> mimPrice = phones.stream()
                .min(Comparator.comparing(Phone::price)).stream().toList();
        System.out.println(mimPrice);
    }
}
