package homework_2.task_2;


public class TaskTwo {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 3; i <= 24; i = i + 3) {
            a = a + a;
            System.out.print("за " + i + " часа будет ");//может быть в одну строчку эти 2 println
            System.out.println(a + " амеб");
        }
    }
}
