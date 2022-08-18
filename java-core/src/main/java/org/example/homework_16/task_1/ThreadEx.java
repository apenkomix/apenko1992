package homework_16.task_1;

public class ThreadEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started...");
        MyThread t = new MyThread("JThread ");
        t.start();
        t.join();
        System.out.println("Main thread finished...");
    }
}