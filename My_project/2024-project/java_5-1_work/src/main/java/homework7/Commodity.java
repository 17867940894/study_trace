package homework7;

public class Commodity {
    private String type;
    private String name;
    private double price;
    private int number;

    public Commodity(String type, String name, double price, int number) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public Commodity() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
