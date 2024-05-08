package Demo2;

public class Demo3 {
    public static void main(String[] args) {
        int i = 0;
        double num = 0.0001;
        while(num <= 8848){
            ++i;
            num *= 2;
        }
        System.out.println(i);
    }
}
