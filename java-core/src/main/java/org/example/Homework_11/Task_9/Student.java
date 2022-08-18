package Homework_11.Task_9;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int year;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return name.compareTo(s.getName());
    }
}



