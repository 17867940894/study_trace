package Work;

import java.util.*;

public class TextPoker {

    public static void main(String[] args) {
        List<String> poker = new ArrayList();
        show(poker);
        System.out.println(poker);
        Collections.shuffle(poker);
        List<List<String>> persons = new ArrayList<>();
        deal(persons, poker);
    }

    //发牌
    private static void deal(List<List<String>> persons, List<String> poker) {
        List<String> person1 = new ArrayList<>();
        List<String> person2 = new ArrayList<>();
        List<String> person3 = new ArrayList<>();
        List<String> Cards = new ArrayList<>();//底牌
        for (int i = 0; i < 54; i++) {
            if (i / 17 < 1) {
                person1.add(poker.get(i));
            } else if (i/17 >= 1 && i/17 < 2) {
                person2.add(poker.get(i));
            } else if (i / 17 >= 2 && i/17 < 3) {
                person3.add(poker.get(i));
            } else {
                Cards.add(poker.get(i));
            }
        }
        Collections.sort(person1);
        Collections.sort(person2);
        Collections.sort(person3);
        persons.addAll(Arrays.asList(person1, person2, person3, Cards));
        for (List<String> list : persons)
            System.out.println(list);
    }

    private static void show(List<String> poker) {
        PokerNumber pokerNumber = new PokerNumber();
        PokerSuit pokerSuit = new PokerSuit();
        String[] Suit = pokerSuit.getSuit();
        String[] Number = pokerNumber.getNumber();
        for (int i = 0; i < Suit.length; i++) {
            for (int j = 0; j < Number.length; j++) {
                poker.add(Suit[i] + Number[j]);
            }
        }
        poker.add(pokerSuit.getKing());
        poker.add(pokerSuit.getJoker());
    }
}
