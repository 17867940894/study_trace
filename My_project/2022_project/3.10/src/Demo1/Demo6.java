package Demo1;
public class Demo6 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 50) {
            ++i;
            System.out.print(i % 5 == 0 ? i + "\n" : i + "\t");
        }
    }
}
