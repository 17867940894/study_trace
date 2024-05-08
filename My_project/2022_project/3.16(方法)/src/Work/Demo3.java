package Work;
//3.返回成绩数组的平均分
public class Demo3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] aa = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 101, 12}
        };
        System.out.println("数组的平均分是:" + show(a)/len(a));
        System.out.println("数组的平均分是:" + show(aa)/len(aa));
    }

    private static double len(int[][] aa) {
        double len = 0;
        for(int[] i : aa){
            for (int j : i){
                ++len;
            }
        }
        return len;
    }

    private static double len(int[] a) {
        double len = 0;
        for(int i : a){
                ++len;
        }
        return len;
    }

    private static double show(int[][] aa) {
        double sum = 0;
        for(int[] i : aa){
            sum += show(i);
        }
        return sum;
    }

    public static double show(int[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
