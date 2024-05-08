package 方法及返回;

/*
定义方法，参数是可变参数，计算参数的平均值、最大最小值、总和
 */
public class Demo4 {
    public static void main(String[] args) {
        mean(1, 2, 4, 5, 3, 8, 6, 7);
        max(1, 2, 4, 5, 3, 8, 6, 7);
        min(1, 2, 4, 5, 3, 8, 6, 7);
        sum(1, 2, 4, 5, 3, 8, 6, 7);
    }

    //求和
    public static void sum(double... d) {
        double sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
        }
        System.out.println("总和为:" + sum);
    }

    //求最大值
    public static void max(double... d) {
        double max = d[0];
        for (int i = 0; i < d.length; i++) {
            max = max >= d[i] ? max : d[i];
        }
        System.out.println("最大值是:" + max);
    }

    //求最小值
    public static void min(double... d) {
        double min = d[0];
        for (int i = 0; i < d.length; i++) {
            min = min <= d[i] ? min : d[i];
        }
        System.out.println("最小值是:" + min);
    }

    //求取平均值
    public static void mean(double... d) {
        double num = 0;
        for (int i = 0; i < d.length; i++) {
            num += d[i];
        }
        System.out.println("平均值是:" + num / d.length);
    }
}
