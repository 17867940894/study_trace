package Demo2;

public class Demo3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            for (int j = 5-i; j >= 0; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
