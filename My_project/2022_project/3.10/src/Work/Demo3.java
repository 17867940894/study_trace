package Work;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(show(2.5, 3));
    }

    private static double show(double m, int n) {
        int num = 0;
        double sum = m;
        while (++num <= n) {
            sum *= m;
        }
        return sum;
    }
}
