package homework7;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("圆周长: " + circle.calculatePerimeter());
        System.out.println("圆面积: " + circle.calculateArea());

        Square square = new Square(4.0);
        System.out.println("正方形周长: " + square.calculatePerimeter());
        System.out.println("正方形面积: " + square.calculateArea());
    }
}
