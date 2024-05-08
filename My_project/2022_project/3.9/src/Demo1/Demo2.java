package Demo1;

public class Demo2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 3;
        System.out.println((a>b?a:b)>c?(a>b?a:b):c);
        System.out.println(Math.max(Math.max(a,b),c));
    }
}
