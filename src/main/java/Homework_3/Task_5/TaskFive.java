package Homework_3.Task_5;

public class TaskFive {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4};
        int order = 0; //что значит имя переменной? Как я вижу, это буфер для перекидки элементов. Может быть temp, buff, buffer  
        for (int i = 0; i < array.length / 2; i++) {
            order = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = order;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
