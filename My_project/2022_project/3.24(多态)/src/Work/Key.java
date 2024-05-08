package Work;

public class Key extends Hardware{
    public Key() {
    }

    public Key(String name, int money) {
        super(name, money);
    }

    public void shine(){
        System.out.println("功能: 发光");
    }

    @Override
    public void briefIntroduction(Hardware hardware) {
        System.out.println("商品名称:" + hardware.getName() + "\t" + "价格:" + hardware.getMoney());
    }
}
