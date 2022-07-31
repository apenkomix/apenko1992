package homework_7.task_2;

public class Alucard {
    public static void main(String[] args) {
        String alucard = "alucard";
        char[] reversArray = alucard.toCharArray();
        for (int i = reversArray.length - 1; i >= 0; i--) {

            System.out.print(reversArray[i]);
        }
    }
}
