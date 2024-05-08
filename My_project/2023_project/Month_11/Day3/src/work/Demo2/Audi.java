package work.Demo2;

public class Audi extends Car{
    String quality;

    public Audi() {

    }

    @Override
    public String toString() {
        return "Audi{" +
                "quality='" + quality + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Audi(String quality) {
        this.quality = quality;
    }

    public Audi(String brand, int price, String quality) {
        super(brand, price);
        this.quality = quality;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("灯很亮");
    }
}
