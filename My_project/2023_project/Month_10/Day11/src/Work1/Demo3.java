package Work1;

public class Demo3 {
    /**
     * 返回一个字符串和另一个字符串的长度差
     */
    public static void main(String[] args) {
        String[] num1 = {"a"};
        String[] num2 = {"a","a","a","a","a","a","0"};
        System.out.println(Length(num1, num2));
    }

    private static int Length(String[] num1, String[] num2) {
        int m = num1.length;
        int n = num2.length;
        return m>n?m-n:n-m;
    }
}
