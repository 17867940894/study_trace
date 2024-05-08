package Demo2;

public class Demo4 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        boolean b = false;
        while (++i <= 100) {
            sum += i * Math.pow(-1, i);
            /*b = !b;
                if (b) {
                    sum -= i;
                } else {
                    sum += i;
                }*/
        }
        System.out.println(sum);
    }
}
