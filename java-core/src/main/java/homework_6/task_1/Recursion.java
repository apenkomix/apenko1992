package homework_6.task_1;

public class Recursion {
    public static void main(String[] args) {
        Integer [] array = new Integer[]{1, 2, 3, 4, 5, 6};
        calculate(array,0);
    }

    public static void calculate(Integer[] array,Integer number) {
        if (number >= array.length) {
            return;
        }
        System.out.println(array[number]);
        calculate(array, number + 1);
    }
}
