package Poker;

import java.util.*;

public class PokerService {
    static Map<Integer, String> map = new TreeMap<>();
    static List<String> list = new ArrayList<>();
    static Map<Integer, Map<Integer, String>> players = new TreeMap<>();

    public static void Start() {
        tallyPoker();
        dealPoker();
    }

    //发牌
    public static void dealPoker() {
        shuffle();
        Map<Integer, String> player1 = new TreeMap<>();
        Map<Integer, String> player2 = new TreeMap<>();
        Map<Integer, String> player3 = new TreeMap<>();
        players.put(1, player1);
        players.put(2, player2);
        players.put(3, player3);
        for (int i = 0; i < list.size() - 3; i++) {
            if (i % 3 == 0) {
                player1.put(findKey(list.get(i)), list.get(i));
            }
            if (i % 3 == 1) {
                player2.put(findKey(list.get(i)), list.get(i));
            }
            if (i % 3 == 2) {
                player3.put(findKey(list.get(i)), list.get(i));
            }
        }
    }

    public static Integer findKey(String s) {
        for (Integer integer : map.keySet()) {
            if (map.get(integer).equals(s)) {
                map.remove(integer);
                return integer;
            }
        }
        return null;
    }

    //标记牌
    public static void tallyPoker() {
        poker();
        int index = 0;
        for (String s : list) {
            map.put(index++, s);
        }
    }

    //打乱扑克
    public static void shuffle() {
        Collections.shuffle(list);
    }

    //创建扑克
    public static void poker() {
        PokerSuit p = new PokerSuit();
        for (String number : new PokerNumber().getNumber()) {
            for (String suit : p.getSuit()) {
                list.add(suit + number);
            }
        }
        list.add(p.getJoker());
        list.add(p.getKing());
    }

    public static void show() {
        for (Map<Integer, String> value : players.values()) {
            for (String s : value.values()) {
                System.out.print(s + " ");
            }
            System.out.println();
        }


        for (String value : map.values()) {
            System.out.print(value + " ");
        }
    }
}
