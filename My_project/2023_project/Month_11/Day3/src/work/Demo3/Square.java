package work.Demo3;

public class Square extends Graph {
    double w;
    double h;

    public Square() {
    }

    public Square(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    double S() {
        return w * h;
    }

    @Override
    double L() {
        return 2 * (w + h);
    }
}
