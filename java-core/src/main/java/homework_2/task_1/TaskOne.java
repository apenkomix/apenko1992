package homework_2.task_1;


public class TaskOne {
    public static void main(String[] args) {
        double a = 10;
        for (int i = 1; i <= 7; i = i + 1) {
            System.out.println(i + "day he run" + a + "km");
            a = a * 1.1;
        }
    }
}
