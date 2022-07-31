package homework_4.task_1;

import java.util.Objects;

public class Bulldog {
    private Integer age;
    private String name;
    private static String text = "Hello from static";

    public static void setText(String text) {
        Bulldog.text = text;
    }

    public static void print() {
        System.out.println(text);
    }

    public Bulldog(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Bulldog() {
        this(null, "Unknown");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String show() {
        return "The name is " + this.name + ". The age is " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o != null || getClass() == o.getClass()) return false;
        Bulldog bulldog = (Bulldog) o;
        return Objects.equals(this.age, bulldog.age) && Objects.equals(this.name, bulldog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.age, this.name);
    }
}

