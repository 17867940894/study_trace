package exercise;

public class Demo10 {
    //TODO 判断一个字符串是否是回文的
    public static void main(String[] args) {
        String s = "123654789";
        String ss = "12345678987654321";
        System.out.println(show(ss));
    }

    private static boolean show(String s) {
        for (int i = 0 , j = s.length() - 1; i < s.length() / 2; i++ , j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
