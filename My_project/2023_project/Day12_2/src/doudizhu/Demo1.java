package doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> flowers = new ArrayList<>();
        Collections.addAll(flowers, "♥", "♠", "♣", "♦");
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(numbers, "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");
        ArrayList<String> poker = new ArrayList<>();
        for (int i = 0; i < flowers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                poker.add(flowers.get(i) + numbers.get(j));
            }
        }
        poker.add("小王");//小王
        poker.add("大王");//大王
        Collections.shuffle(poker);
        System.out.println(poker);
        LinkedList<String> player1 = new LinkedList<>();
        LinkedList<String> player2 = new LinkedList<>();
        LinkedList<String> player3 = new LinkedList<>();

        int len = poker.size();
        for (int i = 0; i < len - 3; i++) {
            if (i % 3 == 0)
                player1.add(poker.remove(0));
            if (i % 3 == 1)
                player2.add(poker.remove(0));
            if (i % 3 == 2)
                player3.add(poker.remove(0));
        }
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(poker);
    }
}
