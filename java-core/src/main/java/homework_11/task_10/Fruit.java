package homework_11.task_10;

public class Fruit {
    private String name;
    private int kg;

    public Fruit(String name, int kg) {
        this.name = name;
        this.kg = kg;
    }

    public String getName() {
        return name;
    }

    public int getKg() {
        return kg;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", kg=" + kg +
                '}';
    }
}
