package Work;

public class Demo2_2 {
    public static void main(String[] args) {
        System.out.println(show(12.123456789, 6));
    }

    public static double show(double d , int n) {
        int a = (int) (d*Math.pow(10,n));
        return a/Math.pow(10,n);
    }
}
