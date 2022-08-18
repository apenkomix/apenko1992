package Homework_8.Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("You can type");
            int number = scanner.nextInt();
            int secondnumber = scanner.nextInt();
            System.out.println(divide(number, secondnumber));
        }  catch (Exception e){
            System.out.println("0 can not be divided");
        } finally {
            System.out.println("Try again!");
        }
    }
    private static int divide(int number, int secondnumber) {
        return number / secondnumber;
    }
}
