package Poker;

public class PokerSuit {
    private String[] Suit = {"♠","♣","❤","♦"};
    private String King = "大🐢";
    private String Joker = "小🐢";

    public PokerSuit() {
    }

    public String[] getSuit() {
        return Suit;
    }

    public void setSuit(String[] suit) {
        Suit = suit;
    }

    public String getKing() {
        return King;
    }

    public void setKing(String king) {
        King = king;
    }

    public String getJoker() {
        return Joker;
    }

    public void setJoker(String joker) {
        Joker = joker;
    }

    public PokerSuit(String[] suit, String king, String joker) {
        Suit = suit;
        King = king;
        Joker = joker;
    }
}
