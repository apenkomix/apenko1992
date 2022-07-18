package Homework_5.Task_1;

import Homework_5.Task_1.Computer;

public class ComputerHP implements Computer {
    @Override
    public void turnOn() {
        System.out.println("turnOn");
    }
    @Override
    public void turnOff() {
        System.out.println("turnOff");
    }
    @Override
    public void reset() {
        System.out.println("reset");
    }
}
