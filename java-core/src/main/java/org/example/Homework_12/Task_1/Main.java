package Homework_12.Task_1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Orange " + date));
        productList.add(new Product("Milk " + date));
        productList.add(new Product("Car" + date));
        System.out.println(productList);
    }
}
