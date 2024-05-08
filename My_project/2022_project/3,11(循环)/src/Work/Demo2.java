package Work;
//十进制转二进制
public class Demo2 {
    public static void main(String[] args) {
        int number = 47;
        String s = "";
        for (int i = number; i >= 1; i = i / 2) {
            if (i % 2 == 0) {
                s = 0 + s;
            } else {
                s = 1 + s;
            }
        }
        if (number == 0) {
            s = "0000";
        } else if (s.length() % 4 != 0) {
            for (int i = s.length() % 4; i < 4; i++) {
                s = 0 + s;
            }
        }
        System.out.println(s);
    }
}
