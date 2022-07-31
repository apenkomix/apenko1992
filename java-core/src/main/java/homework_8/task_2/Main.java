package homework_8.task_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Type pls");
            String nextStr = scanner.next();
            System.out.println(parse(nextStr));
        } catch (Exception e){
            System.out.println("Incorect number");
        }

    }
    static int parse (String String){
        return Integer.parseInt(String);
    }
}
