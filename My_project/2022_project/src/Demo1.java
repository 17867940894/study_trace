import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo1 {

    public static void main(String[] args) {
        int[] num1 = {1,3,6,7,8,3,15,9,3,3};
        int[] num2 = new int[num1.length];
        Set<Integer> arr = new HashSet<>();
        int cont = 1;

        for (int i = 0; i < num1.length; i++) {
            if (num1[i] == 3){
                if (cont == 1)
                    num2[i] = 111;
                if (cont == 2)
                    num2[i] = 222;
                if (cont == 3) {
                    num2[i] = 301;
                    cont = 0;
                }
                cont++;
            }else
                num2[i] = num1[i];
        }
        System.out.println(Arrays.toString(num2));

        for (int i : num1) {
            arr.add(i);
        }
        for (int i : num2) {
            arr.add(i);
        }

        int[] num3 = new int[arr.size()];
        cont = 0;
        for (Integer integer : arr) {
            num3[cont++] = integer;
        }
        System.out.println(Arrays.toString(num3));
        Arrays.sort(num3);
        System.out.println(Arrays.toString(num3));
    }

}
