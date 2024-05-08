package Demo2;

public class Demo2 {
    public static void main(String[] args) {
        int i = 1000;
        while (i++ < 10000) {//9999
            int a = i / 1000;
            int b = i % 1000 / 100;
            int c = i % 100 / 10;
            int d = i % 10;
            if (Math.pow(a, (i + "").length()) + Math.pow(b, (i + "").length()) + Math.pow(c, (i + "").length()) + Math.pow(d, (i + "").length()) == i) {
                System.out.println(i);
            }
        }
    }
}
