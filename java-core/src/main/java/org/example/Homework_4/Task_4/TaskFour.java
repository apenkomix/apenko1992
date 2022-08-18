package Homework_4.Task_4;

import Homework_4.Task_1.Bulldog;

public class TaskFour {
    public static void main(String[] args) {
        Bulldog bulldog = new Bulldog(13,"Pitt");
        Bulldog bulldog1 = new Bulldog(12, "Jhony");

        bulldog.print();

        bulldog.setText("New text");

        bulldog1.print();
    }
}
