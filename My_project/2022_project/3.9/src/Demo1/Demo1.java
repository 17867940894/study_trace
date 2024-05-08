package Demo1;

public class Demo1 {
    public static void main(String[] args) {
        int a = 22;
        int b = 4;
        int c = b;
        b = a;
        a = c;
        System.out.println(a);
        System.out.println(b);
    }
}
