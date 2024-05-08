package work.Demo2;

public class keyboard extends HardWare implements Usb{

    int keyCap_Number;

    public int getKeyCap_Number() {
        return keyCap_Number;
    }

    public void setKeyCap_Number(int keyCap_Number) {
        this.keyCap_Number = keyCap_Number;
    }

    @Override
    public void show() {
        System.out.print("价格" + price + "的" + brand + "键帽数量为" + keyCap_Number + "的");
    }

    public keyboard(){

    }

    public keyboard(int keyCap_Number) {
        this.keyCap_Number = keyCap_Number;
    }

    public keyboard(int price, String brand, int keyCap_Number) {
        super(price, brand);
        this.keyCap_Number = keyCap_Number;
    }

    @Override
    public void connect() {
        show();
        System.out.println("键盘已连接");
    }

    @Override
    public void disConnect() {
        System.out.println("键盘连接已断开");
    }
}
