package homework_3.task_2;

//+
public class TaskTwo {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        int average = 0; //можно перенести ближе к использованию и в той же строчки инициализировать рассчитанным значением
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        System.out.println("The average of array is " + average);
    }
}

