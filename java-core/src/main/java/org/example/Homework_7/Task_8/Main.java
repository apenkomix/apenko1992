package Homework_7.Task_8;

public class Main {
    public static void main(String[] args) {
        String[] string = {"Rachel", "Mickhail", "Rob", "Leo", "Alexsander", "Mila","Richy"};
        for (int i = 0; i < string.length; i++) {
            if (string[i].length() > 5) {
                System.out.println(string[i]);
            }
        }
    }
}