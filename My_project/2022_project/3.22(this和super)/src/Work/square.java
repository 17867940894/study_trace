package Work;
//正方形
public class square extends diagram{
    public square() {
    }

    public square(double r) {
        super(r);
    }

    @Override
    public void perimeter(double r) {
        System.out.println("正方形周长:" + 4*r);
    }

    @Override
    public void area(double r) {
        System.out.println("正方形面积:" + r*r);
    }
}
