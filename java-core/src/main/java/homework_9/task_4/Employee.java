package homework_9.task_4;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private Work work;
    private int age;

    public Employee(String name, Work work, int age) {
        this.name = name;
        this.work = work;
        this.age = age;
    }
}
