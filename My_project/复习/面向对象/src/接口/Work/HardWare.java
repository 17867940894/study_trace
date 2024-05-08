package 接口.Work;

public class HardWare {
    private String brand;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HardWare() {
    }

    public HardWare(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
}
