package homework7;

public abstract class Shape {

    abstract double calculatePerimeter();

    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}


