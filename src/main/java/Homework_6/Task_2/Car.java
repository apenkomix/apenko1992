package Homework_6.Task_2;

public class Car {
    private Transmision transmision;
    private Engine engine;

    public Car(Transmision transmision, Engine engine) {
        this.engine = engine;
        this.transmision = transmision;
    }

    public void startEngine() {
        engine.startEngine();
    }

    public void stopEngine() {
        engine.stopEngine();
    }

    public void addSpeed() {
        transmision.addSpeed();
    }

    public void reduceSpeed() {
        transmision.reduceSpeed();
    }

    public void drive() {
        if (!engine.engineOn()) {
            System.out.println("Engine Off cant drive");
            return;
        }
            if (engine.engineOn()){
                System.out.println("Car speed " + transmision.getSpeed() * 20 + "km/h");
        }
    }
}