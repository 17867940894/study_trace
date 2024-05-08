public class Demo1 {
    public static void main(String[] args) {
        /*
            十进制中最大的值
         */
        String s = "sda631d6w5adszaz54dq56";
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            n = n>s.charAt(i)?n:s.charAt(i);
        }
        System.out.println((char)n);
    }
}
