package Demo2;
import java.io.IOException;
public class Demo2 {
    public static void main(String[] args) throws IOException {
            long start = System.currentTimeMillis();
            for(int i = 0;i <= 500000;i++){
                System.out.println(i);
            }
            System.out.println(System.currentTimeMillis()-start);
    }
}
