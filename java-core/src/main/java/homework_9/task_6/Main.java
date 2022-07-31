package homework_9.task_6;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        String text = "Best club";
        try(FileOutputStream fos = new FileOutputStream("src/Homework_9/Task_6/Manchester.png", true)){
            byte[] buffer = text.getBytes();
            fos.write(buffer,0, buffer.length);
            System.out.println("File has been written");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
