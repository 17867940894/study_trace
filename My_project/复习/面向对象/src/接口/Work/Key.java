package 接口.Work;

public class Key extends HardWare implements USB{
    private int numOfKey;

    public int getNumOfKey() {
        return numOfKey;
    }

    public void setNumOfKey(int numOfKey) {
        this.numOfKey = numOfKey;
    }

    public Key(String brand, int price, int numOfKey) {
        super(brand, price);
        this.numOfKey = numOfKey;
    }

    public Key() {
    }

    public Key(int numOfKey) {
        this.numOfKey = numOfKey;
    }

    @Override
    public void connect() {
        System.out.println("价值" + getPrice() + "的" + getBrand() + "键盘已连接");
    }
}
