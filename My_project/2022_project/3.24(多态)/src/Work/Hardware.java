package Work;

public abstract class Hardware {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Hardware() {
    }

    public Hardware(String name, int money) {
        this.name = name;
        this.money = money;
    }

    private int money;

    public abstract void briefIntroduction(Hardware hardware);
}
