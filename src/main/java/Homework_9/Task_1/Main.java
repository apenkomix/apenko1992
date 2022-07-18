package Homework_9.Task_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        try {
            FileOutputStream fos = new FileOutputStream("src/Homework_9/Task_1/numbers.txt");
            for (int i = 0; i < numbers.length; i++) {
                fos.write(numbers[i]);
                fos.flush();
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
