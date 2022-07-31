package homework_2.task_8;

//+
public class TaskEight {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        int sum = 0;
        for (int i = 0; i <= 100; i += 1) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
            sum += i;
        }
        System.out.println("Сумма четных чисел " + evenSum);
        System.out.println("Сумма нечетных чисел " + oddSum);
        System.out.println("Сумма всех чисел " + sum);
    }
}

