package Homework_7.Task_4;

import java.util.HashMap;
import java.util.Map;

public class Text {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";
        text = text.toLowerCase().replace(".", " ").replace("\n", " ").replace(",", "");
        String[] split = text.split(" ");
        int alert = 0;
        int add = 0;
        int good = 0;
        int plan = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("alert")) {
                alert++;
            }
            if (split[i].equals("add")){
                add++;
            }
            if (split[i].equals("good")){
                good++;
            }
            if (split[i].equals("plan")){
                plan++;
            }
        }
        System.out.println("Word ALERT  appears " + alert + " times");
        System.out.println("Word ADD appears " + add + " times");
        System.out.println("Word GOOD appears " + good + " раз");
        System.out.println("Word PLAN appears " + plan + " раз");
    }
}