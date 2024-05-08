package Work;

//TODO 2.定义方法有两个String参数，输出它们的长度差
public class Demo2 {
    public static void main(String[] args) {
        System.out.println("字符串长度差是:   " + show("123456","321"));
    }

    public static int show(String s1, String s2) {
        return Math.abs(s1.length() - s2.length());
    }
}
