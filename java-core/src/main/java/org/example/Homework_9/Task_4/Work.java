package Homework_9.Task_4;

import java.io.Serializable;

public class Work implements Serializable {
    private String name;
    private int experience;

    public Work(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
}
