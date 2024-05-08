package Demo1;

public class Demo4 {
    public static void main(String[] args) {
        int[] a = {0};
        int[] b = a;
        a[0] = 5;
        System.out.println(b[0]);

    }
}
