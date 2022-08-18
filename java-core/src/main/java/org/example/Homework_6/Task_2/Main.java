package Homework_6.Task_2;

public class Main {
    public static void main(String[] args) {
        Transmision transmision = new Transmision();
        Engine engine = new Engine();
        Car car = new Car(transmision,engine);

        car.startEngine();
        car.addSpeed();
        car.addSpeed();
        car.drive();
        car.startEngine();
        car.reduceSpeed();
        car.drive();
        car.stopEngine();
        car.stopEngine();
        car.drive();

    }
}