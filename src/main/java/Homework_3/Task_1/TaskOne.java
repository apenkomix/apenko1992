package Homework_3.Task_1;

import java.util.Scanner;


public class TaskOne {
    public static void main(String[] args) {
        int array[] = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element of the array: ");
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        int maxNumber = array[0];
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            } else if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }

        System.out.println("The sum of the elements is: " + sum);
        System.out.println("The max of the elements is: " + maxNumber);
        System.out.println("The min of the elements is: " + minNumber);
    }
}
