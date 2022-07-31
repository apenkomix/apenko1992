package homework_3.task_4;

public class TaskFour {
    public static void main(String[] args) {
        int[][] array = new int[9][9];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i + 1) * (j + 1);
                System.out.print(array[i][j] + " ");
                if (array[i][j] < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
