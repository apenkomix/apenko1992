package Homework_13.Task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> producers = List.of("Sumsung","Xiomi","Apple");
        List<Phone> phones = List.of(
                new Phone("17","Xiomi"),
                new Phone("11","Apple"),
                new Phone ("20","Sumsung"),
                new Phone("13", "Nokia"),
                new Phone("43","Sony"),
                new Phone("35","Sony"));
        List<String> producer = phones.stream().map(Phone::getProducer)
                .filter(producers::contains).
                collect(Collectors.toList());
        System.out.println(producer);
    }
}
