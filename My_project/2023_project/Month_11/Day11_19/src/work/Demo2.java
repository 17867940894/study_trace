package work;

public class Demo2 {
    /**
     * 定义一个方法有两个String参数，返回它们的长度差
     */
    public static void main(String[] args) {
        System.out.println(function("123", "323213"));
    }

    private static int function(String s, String s1) {
        return Math.abs(s.length() - s1.length());
    }
}
