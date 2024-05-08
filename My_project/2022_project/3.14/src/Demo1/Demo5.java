package Demo1;

public class Demo5 {
    public static void main(String[] args) {
        String[] s = {"曹操", "曹仁", "曹真","曹德", "曹爽"};
        String sss = "";
        for (String ss : s) {
            if (ss == s[0]) {
                sss += "[" + ss;
            } else {
                sss += "," + ss;
                if (ss == s[s.length - 1])
                    sss += "]";
            }
        }
        System.out.println(sss);
    }
}
