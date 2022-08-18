package Homework_10.Task_1;

public class Main {
    public static void main(String[] args) {
        Summer<Integer> summer = new Summer<>(22, "class");
        System.out.println(summer.getComment().getClass().getName());

    }
}
