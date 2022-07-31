package homework_6.task_2;

public class Engine {
    private boolean on = false;

    public boolean engineOn() {
        return on;
    }

    public void startEngine() {
        if (!on) {
            System.out.println("Engine started");
        }
        if (on = true) {
            System.out.println("Engine already started");
        }
    }

    public void stopEngine() {
        if (!on) {
            System.out.println("Engine already off");
        }
        on = false;
        }
    }

