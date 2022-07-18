package Homework_11.Task_8;

public class Shop<T,S> {
    private T id;
    private S name;

    public Shop(T id, S name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public S getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
