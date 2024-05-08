package work.Demo3;

public class Round extends Graph {

    double r;

    public Round() {
    }

    public Round(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    double S() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    double L() {
        return 2 * Math.PI * r;
    }
}
