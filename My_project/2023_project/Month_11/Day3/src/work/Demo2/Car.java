package work.Demo2;

public class Car {
    String brand;
    int price;

    public void show(){
        System.out.println("出行");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car() {
    }

    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
}
