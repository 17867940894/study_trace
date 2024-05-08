package Work;
//圆形
public class round extends diagram{

    public round() {
    }

    public round(double r) {
        super(r);
    }

    @Override
    public void perimeter(double r) {
        System.out.println("圆形周长:" + 2*Math.PI*r);
    }

    @Override
    public void area(double r) {
        System.out.println("圆形面积:" + Math.PI*Math.pow(r,2));
    }
}
