import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) throws IOException {
        /*int[] arr = {1,2,3};
        Perm(arr , 0 , arr.length);*/
        File file = new File("a.txt");
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
    }

    //TODO 全排列
    private static void Perm(int[] arr, int start, int end) {
        if (start == end){
                System.out.println(Arrays.toString(arr));
        }else{
            for (int i = start; i < end; ++i) {
                Swap(arr , start , i);
                Perm(arr , start + 1 , end);
                Swap(arr , start , i);
            }
        }
    }

    private static void Swap(int[] arr, int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }


}
