package homework_8.task_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxLength = 20;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Type array length");
                int arraySize = scanner.nextInt();
                if (arraySize > maxLength || arraySize < 0) {
                    throw new SizeLimitException();
                }
                Integer[] array = new Integer[arraySize];
                break;
            } catch (SizeLimitException e) {
                System.out.println("Max length 20");
            } catch (InputMismatchException exception){
                System.out.println("Type number pls");
                break;
            }
        }
    }
}

