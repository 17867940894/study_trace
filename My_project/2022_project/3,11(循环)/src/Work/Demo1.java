package Work;

//数字大写小写最大十进制
public class Demo1 {
    public static void main(String[] args) {
        String s = "sa9dca124dz54aw1cY61wadafSDWFWWsCNSQNI31";
        String a = " ";
        String A = " ";
        String n = " ";
        for (int i = 0; i < s.length(); i++) {
            int m = s.charAt(i);
            if (m >= 'a' && m <= 'z') {
                a = a.charAt(0) > m ? a : (char) m + "";
            } else if (m >= '0' && m <= '9') {
                n = n.charAt(0) > m ? n : (char) m + "";
            } else if (m >= 'A' && m <= 'Z') {
                A = A.charAt(0) > m ? A : (char) m + "";
            }
        }
        System.out.println(a + "\t" + A + "\t" + n);
    }
}
