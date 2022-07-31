package homework_3.task_7;

public class TaskSeven {
    public static void main(String[] args) {
        int[] array = new int[]{9, 3, 4, 7, 1, 8, 5, 0, 6, 2};
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


