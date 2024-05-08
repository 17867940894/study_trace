package Work;
/*
比较长度是否相同(两个参数)
       如果第一个字符和参数的第一个字符不等，结束比较，返回第一个字符的ASCII码差值。
       如果第一个字符和参数的第一个字符相等，则以第二个字符和参数的第二个字符做比较，以此类推,直至不等为止，返回该字符的ASCII码差值。
       如果两个字符串不一样长，可对应字符又完全一样，则返回两个字符串的长度差值。
 */

//  TODO 手动实现字符串的compareTo方法
public class Demo1 {
    public static void main(String[] args) {
        String s = "a33456709";
       String ss = "a33456729";
        System.out.println(compareTo(s, ss));
        System.out.println(s.compareTo(ss));

    }

    private static int compareTo(String s1 , String s2){
        if (s1.length() != s2.length()){
            if (s1.startsWith(s2) || s2.startsWith(s1))
                return s1.length() - s2.length();
            int n = Math.min(s1.length(),s2.length());
            for (int i = 0; i < n; i++) {
                if (s1.charAt(i) != s2.charAt(i))
                    return s1.charAt(i) - s2.charAt(i);
            }
            return s1.length() - s2.length();
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return s1.charAt(i) - s2.charAt(i);
        }
        return 0;
    }

}
