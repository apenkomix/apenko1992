package homework_16.task_1;

class MyThread extends Thread {
    public MyThread(String myThread) {
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        thread.setName("ThreadOne");
        for (int i = 0; i < 21; i++) {
            System.out.println(i + currentThread().getName());
            try {
                thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);

            }
        }
    }
}