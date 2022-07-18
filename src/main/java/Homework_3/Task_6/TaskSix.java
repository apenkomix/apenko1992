package Homework_3.Task_6;

public class TaskSix {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array1 = new int[(array.length) / 2]; //попробуй подобрать более значащее название переменной
        for (int i = 0; i < array.length; i += 2) {
            array1[i/2] = array[i] + 1;
            System.out.println(array1[i/2]); //стоит вывести весь массив сразу, а не поэлементно, чтобы показать, что там лежат все нужные элементы
        }
    }
}
