package Demo3;

public class Mouse extends Hardware{
    private int dpi;

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    @Override
    public void show() {
        System.out.println("鼠标名称:" + getName() + "\t" + "鼠标价格:" + getMoney() + "\t" + "鼠标DPI:" + getDpi());
    }

    public Mouse() {
    }

    public Mouse(String name, int money , int dpi) {
        super(name, money);
        this.dpi = dpi;
    }
}
