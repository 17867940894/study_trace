package Work;
//1.返回一个数组中的最大值
public class Demo1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] aa = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 101, 12}
        };
        System.out.println("数组中的最大值是:" + show(a));
        System.out.println("数组中的最大值是:" + show(aa));
    }

    private static int show(int[][] aa) {
        int max = 0;
        for(int[] i : aa){
            max = max > show(i)?max:show(i);
        }
        return max;
    }

    public static int show(int[] a){
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = max>a[i]?max:a[i];
        }
        return max;
    }
}
