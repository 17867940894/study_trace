package work.Demo2;

public class Mouse extends HardWare implements Usb{

    int dB;

    public int getdB() {
        return dB;
    }

    public void setdB(int dB) {
        this.dB = dB;
    }

    @Override
    public void show() {
        System.out.print("价格" + price + "的" + brand + "鼠标灵敏度为" + dB + "的");
    }

    public Mouse() {
    }

    public Mouse(int dB) {
        this.dB = dB;
    }

    public Mouse(int price, String brand, int dB) {
        super(price, brand);
        this.dB = dB;
    }

    @Override
    public void connect() {
        show();
        System.out.println("鼠标已连接");
    }

    @Override
    public void disConnect() {
        System.out.println("鼠标连接已断开");
    }
}
