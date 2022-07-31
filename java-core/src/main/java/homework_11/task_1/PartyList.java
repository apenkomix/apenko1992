package homework_11.task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PartyList {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Map<String, Integer> persons = new HashMap<>();
        persons.put("Mike",1);
        persons.put("Jhon",2);
        persons.put("Egorka",3);

        while (persons.containsKey(name)){
            System.out.println("Welcome to the party!");
            break;
        }
        if(!persons.containsKey(name)){
            System.out.println("Sorry, you are not in the list");
        }
    }
}


