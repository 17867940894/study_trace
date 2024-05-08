package Poker;

public class PokerNumber {
    private String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public String[] getNumber() {
        return number;
    }

    public void setNumber(String[] number) {
        this.number = number;
    }

    public PokerNumber() {
    }

    public PokerNumber(String[] number) {
        this.number = number;
    }
}
