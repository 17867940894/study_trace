package Demo1;

public class Demo1 {
    public static void main(String[] args) {
        String s = "125asd489wa1faw31c2wad6w,.e,.,.<lkocea561";
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i);
            if (num >= 'a' && num <= 'z') {
                a += 1;
            } else if (num >= '0' && num <= '9') {
                b += 1;
            } else {
                c += 1;
            }
        }
        System.out.println(a + "\t" + b + "\t" + c + "");
    }
}
