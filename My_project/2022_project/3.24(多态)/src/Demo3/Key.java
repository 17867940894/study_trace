package Demo3;

public class Key extends Hardware{

    @Override
    public void show() {
        System.out.println("键盘名称:" + getName() + "\t" + "键盘价格:" + getMoney());
    }

    public Key() {
    }

    public Key(String name, int money) {
        super(name, money);
    }
}
