public class Demo2 {
    public static void main(String[] args) {
        /*
        大小写转换
         */
        String s1 = "sda631d6w5aAAA54dq56";
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (s1.charAt(i) >= 'a' & s1.charAt(i) <= 'z'){
                c -= 32;
                s2 += c;
            }else if(s1.charAt(i) >= 'A' & s1.charAt(i) <= 'Z'){
                c += 32;
                s2 += c;
            }else {
                s2 += s1.charAt(i);
            }

        }
        System.out.println(s2);
    }
}
