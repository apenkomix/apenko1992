package Homework_11.Task_9;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        Student student1 = new Student("Mike", 1);
        Student student2 = new Student("Jhon", 2);
        Student student3 = new Student("Kate", 3);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);
    }
}

