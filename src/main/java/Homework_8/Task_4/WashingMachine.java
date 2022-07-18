package Homework_8.Task_4;

public class WashingMachine {
    private boolean waterPresent = false;

    public void start() {
        try {
            waterPresent = true;
            throw new ElectricOut ();
        } catch (ElectricOut e) {
            System.out.println("ElectricityOff");
        } finally {
            flush();
        }
    }

    public void flush() {
        System.out.println("Water drainage");
        waterPresent = false;
    }
}