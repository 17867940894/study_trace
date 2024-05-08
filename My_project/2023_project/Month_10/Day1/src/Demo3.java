import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        /*int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum+=i;
            System.out.println(num[i]);
        }
        System.out.println(sum);*/
        
        System.out.println(Arrays.toString(num));
        for (int i:num){
            System.out.println(i);
        }
    }
}
