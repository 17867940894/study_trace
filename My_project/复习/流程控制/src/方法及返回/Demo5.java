package 方法及返回;

/*
定义方法返回a的b次方
 */
public class Demo5 {
    public static void main(String[] args) {
        System.out.println(say(3, 0));
    }

    public static double say(double d, int i) {
        double sum = d;
        if (i == 0) {
            return 1;
        }
        for (double j = 0; j < i - 1; j++) {
            sum *= d;
        }
        return sum;
    }
}
