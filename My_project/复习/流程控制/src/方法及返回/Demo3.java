package 方法及返回;

/*
3.返回人名数组中姓张的人的个数
 */
public class Demo3 {
    public static void main(String[] args) {
        String[] s = {"张三", "李四", "张飞", "王五", "赵六"};
        System.out.println(say(s));
        show(s);

    }

    public static int say(String[] s) {
        int n = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].charAt(0) == '张') {//在使用"=="时，char类型只能比较char类型
                ++n;
            }
        }
        System.out.println(n);
        return n;
    }

    public static void show(String[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].charAt(0) == '张') {//在使用"=="时，char类型只能比较char类型
                System.out.println(s[i]);
            }
        }
    }

}
