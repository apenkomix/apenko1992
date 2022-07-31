package homework_4.task_4;

import homework_4.task_1.Bulldog;

public class TaskFour {
    public static void main(String[] args) {
        Bulldog bulldog = new Bulldog(13,"Pitt");
        Bulldog bulldog1 = new Bulldog(12, "Jhony");

        bulldog.print();

        bulldog.setText("New text");

        bulldog1.print();
    }
}
