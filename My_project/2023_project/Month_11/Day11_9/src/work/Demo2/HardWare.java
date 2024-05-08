package work.Demo2;

public class HardWare {
    int price;
    String brand;

    public void show(){}

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public HardWare() {
    }

    public HardWare(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }
}
