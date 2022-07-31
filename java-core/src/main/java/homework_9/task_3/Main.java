package homework_9.task_3;

import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/Homework_9/Task_2/repeatedText.txt");
        Scanner scan = new Scanner(fr);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.print(i + ":" + scan.nextLine());
            i++;
        }
        fr.close();
    }
}