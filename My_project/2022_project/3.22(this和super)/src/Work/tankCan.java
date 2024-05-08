package Work;
//油车
public class tankCan extends Car{
    private int fuelTank;//燃油箱

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public tankCan() {
    }

    public tankCan(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public tankCan(String name,String color, int wheel, int fuelTank) {
        super(name,color, wheel);
        this.fuelTank = fuelTank;
    }
}
