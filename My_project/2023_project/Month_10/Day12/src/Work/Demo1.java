package Work;

public class Demo1 {
    /**
     * 定义方法，参数是可变参数，返回若干个整数的总和
     */
    public static void main(String[] args) {
        System.out.println(way(1, 2, 3, 4, 5));
    }

    private static int way(int... a) {
        int sum  = 0;
        for (int i : a){
            sum+=i;
        }
        return sum;
    }
}
