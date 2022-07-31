package homework_2.task_3;

//+
public class TaskThree {
    public static void main(String[] args) {
        //int i = 1; <- убираем ненужные комментарии перед коммитом
        int a = 0;
        for (int i = 1; i <= 256; i = i + i) {
            a = a + i;
        }
        System.out.println("сумма =" + a);
    }
}
