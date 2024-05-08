package Demo2;

public class Demo3 {
    public static void main(String[] args) {
        new Demo3().show2(new Key());
    }

    public static Hardware show(Hardware h) {
        if (h instanceof Mouse)
            h = new Mouse("罗技", 200);
        if (h instanceof Key)
            h = new Key("罗技", 300);
        return h;
    }

    public void show2(Hardware h) {
        h = show(h);
        System.out.println(h.getName() + "\t" + h.getMoney());
    }
}

class Mouse extends Hardware {
    public Mouse(String name, int money) {
        super(name, money);
    }

    public Mouse() {
    }
}

class Key extends Hardware {
    public Key(String name, int money) {
        super(name, money);
    }

    public Key() {
    }
}

abstract class Hardware {
    private String name;
    private int money;

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

    public Hardware(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public Hardware() {
    }
}
