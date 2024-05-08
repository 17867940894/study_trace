package work;

public class Demo1 {
    /**
     * 手动实现字符串的compareTo方法
     */
    public static void main(String[] args) {
        String a = "abcd";
        String b = "ab";
        System.out.println(compare(a, b));
        System.out.println(a.compareTo(b));
    }

    private static int compare(String s1, String s2) {
        if (s1.equals(s2))
            return 0;
        if(s1.startsWith(s2) || s2.startsWith(s1))
            return s1.length() - s2.length();
        return s1.charAt(0) - s2.charAt(0);
    }
}
