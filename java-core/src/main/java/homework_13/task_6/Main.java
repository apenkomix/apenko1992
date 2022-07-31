package homework_13.task_6;

import homework_13.task_3.Phone;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("17","Xiomi"),
                new Phone("11","Apple"),
                new Phone ("20","Sumsung"),
                new Phone("13", "Nokia"),
                new Phone("35","Sony"),
                new Phone("35","Sony"));
        Set<Phone> uniqueProducer = phones.stream().collect(Collectors.toSet());
        System.out.println(uniqueProducer);
    }
}
