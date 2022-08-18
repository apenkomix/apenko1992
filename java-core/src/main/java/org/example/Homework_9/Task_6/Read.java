package Homework_9.Task_6;

import java.io.FileInputStream;

public class Read {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("src/Homework_9/Task_6/Manchester.png")){
            int i = -1;
            while((i = fis.read())!=-1){
                System.out.println((char)i);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
