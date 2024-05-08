package Demo1;

public class Hardware {
    String brand;
    double price;

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

    public Hardware() {
    }

    public Hardware(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Hardware goBack(Hardware hardware){
        if (hardware instanceof Mouse)
            return new Mouse();
        else
            return new Key_board();
    }
}
