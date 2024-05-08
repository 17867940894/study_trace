package Work;
/*
3.创建一个花色集合，创建一个数字集合，通过它们创建一个新的牌集合（String）
♠A♠2♠3♠4...♠K♥A♥2....♥K...♦K🚢✈
4.将牌集合打乱
5.将牌分发给3个玩家集合和底牌集合
6.输出每个玩家的牌集合和底牌集合
 */
public class PokerSuit {
    private String[] Suit = {"♣","♠","❤","♦"};
    private String King = "大🐢";
    private String Joker = "小🐢";

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

    public PokerSuit() {
    }

    public PokerSuit(String[] suit, String king, String joker) {
        Suit = suit;
        King = king;
        Joker = joker;
    }
}
