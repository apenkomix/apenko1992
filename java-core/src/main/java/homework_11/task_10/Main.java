package homework_11.task_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<Fruit>();
        Fruit fruits1 = new Fruit("Apple", 15);
        Fruit fruits2 = new Fruit("Kiwi", 32);
        Fruit fruits3 = new Fruit("Orange", 13);
        Fruit fruits4 = new Fruit("Pinapple", 5);
        Fruit fruits5 = new Fruit("Mango", 7);

        fruits.add(fruits1);
        fruits.add(fruits2);
        fruits.add(fruits3);
        fruits.add(fruits4);
        fruits.add(fruits5);

        Map<String, Integer> fruitsMap = new HashMap<>();
        for (Fruit fruit : fruits) {
            if (!fruitsMap.containsKey(fruit.getName())) {
                fruitsMap.put(fruit.getName(), fruit.getKg());
            } else {
                Integer a = fruitsMap.get(fruit.getName());
                fruitsMap.put(fruit.getName(), a + fruit.getKg());
            }
        }
        System.out.println(fruitsMap);
    }
    }

