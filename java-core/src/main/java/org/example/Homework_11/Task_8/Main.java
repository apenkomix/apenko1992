package Homework_11.Task_8;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Shop> shopSet = new HashSet<>();
        Shop shop1 = new Shop(1,"FixPrice");
        Shop shop2 = new Shop(1,"FixPrice");
        Shop shop3 = new Shop (1,"FixPrice");

        shopSet.add(shop1);
        shopSet.add(shop2);
        shopSet.add(shop3);
        System.out.println(shopSet);
    }
}
