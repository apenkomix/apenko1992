package homework_13.task_3;

import java.util.Objects;

public class Phone {
    private String model;
    private String producer;

    public Phone(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(producer, phone.producer) && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer);
    }
}
