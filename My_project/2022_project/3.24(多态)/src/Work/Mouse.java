package Work;

public class Mouse extends Hardware{
    public Mouse() {
    }

    public Mouse(String name, int money) {
        super(name, money);
    }

    public void cheat(){
        System.out.println("功能: 自动压枪");
    }

    @Override
    public void briefIntroduction(Hardware hardware) {
        System.out.println("商品名称:" + hardware.getName() + "\t" + "价格:" + hardware.getMoney());
    }
}
