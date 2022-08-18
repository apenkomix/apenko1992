package Homework_9.Task_2;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String text = " Hello World";
        String repeatedText = text.repeat(1000);
        try {
            FileWriter fw = new FileWriter("src/Homework_9/Task_2/repeatedText.txt");
            fw.write(repeatedText);
            fw.flush();
        } catch (Exception e) {
            System.out.println("Exeption");
        }
    }
}