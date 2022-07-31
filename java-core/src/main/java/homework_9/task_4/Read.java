package homework_9.task_4;

import java.io.*;

public class Read  {
    public static void main(String[] args) {
        String path = "src/Homework_9/Task_4/employee.txt";
        Employee mikhail = new Employee("Mikhail", new Work("Java Developer", 1), 29);
        writeEmployee(mikhail,path);
        Employee employee = readEmployee(path);
        System.out.println();
    }

    private static void writeEmployee(Employee mikhail, String path) {
        try(FileOutputStream fos = new FileOutputStream(path)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(mikhail);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Employee readEmployee(String path) {
        try (FileInputStream fis = new FileInputStream(path)) {
            ObjectInput ois = new ObjectInputStream(fis);
            return (Employee) ois.readObject();
        } catch (IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
        return null;
    }
}
