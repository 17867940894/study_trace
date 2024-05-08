package WORK;

//1.定义方法，参数是可变参数，返回若干个整数的总和
public class Demo1 {
    public static void main(String[] args) {
        System.out.println("总和是:" + show(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    private static int show(int... i) {
        int sum = 0;
        for (int j : i) {
            sum += j;
        }
        return sum;
    }
}
