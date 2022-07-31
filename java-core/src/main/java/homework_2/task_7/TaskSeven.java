package homework_2.task_7;

public class TaskSeven {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 99; i += 2) {
            sum += i;

            System.out.println(sum); //следует вывести только итоговую сумму, не на каждой итерации 
        }
    }
}

