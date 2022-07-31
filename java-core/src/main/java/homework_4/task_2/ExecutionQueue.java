package homework_4.task_2;

public class ExecutionQueue {
    private static String msg = "statik block";

    public ExecutionQueue() {
        msg = "regular init block";
        msg = "constructor value";
    }

    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();
        System.out.println(msg);
    }
}


