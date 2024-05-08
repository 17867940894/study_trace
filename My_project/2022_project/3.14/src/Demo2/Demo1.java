package Demo2;

public class Demo1 {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder();
        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            b.append("1");
            System.out.println(b);
            /*s += "1";
            System.out.println(s);*/
        }
        System.out.println(System.currentTimeMillis()-start);
    }
}
