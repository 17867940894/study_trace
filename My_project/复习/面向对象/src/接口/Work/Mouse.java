package 接口.Work;

public class Mouse extends HardWare implements USB{
    private int dpi;

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public Mouse(int dpi) {
        this.dpi = dpi;
    }

    public Mouse(String brand, int price, int dpi) {
        super(brand, price);
        this.dpi = dpi;
    }

    public Mouse() {
    }

    @Override
    public void connect() {
        System.out.println("价值" + getPrice() + "的" + getBrand() + "鼠标已连接");
    }
}
