package Work;
//TODO 2.同上一题，定义汽车类和它子类
public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String color;
    private int wheel;//车轮

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public Car() {
    }

    public Car(String name, String color, int wheel) {
        this.name = name;
        this.color = color;
        this.wheel = wheel;
    }
}
