package Demo3;

public abstract class Hardware {
    private String name;
    private int money;

    public abstract void show();



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
}
