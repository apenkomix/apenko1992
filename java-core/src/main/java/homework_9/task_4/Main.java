package homework_9.task_4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Mikhail", new Work("Java Developer", 1), 29);
        try(FileOutputStream fos = new FileOutputStream("src/Homework_9/Task_4/employee.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employee);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}