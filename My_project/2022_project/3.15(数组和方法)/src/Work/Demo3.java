package Work;
//3.比较两个二维数组是否完全相同
public class Demo3 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 10}
        };
        int[][] b = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 10,}
        };
        show(a,b);
    }

    public static void show(int[][] a, int[][] b) {
        boolean boo = true;
        for (int i = 0; i < a.length; i++) {
            if (a.length != b.length) {
                boo = false;
                break;
            }
            for (int j = 0; j < a[i].length; j++) {
                if (a[i].length != b[i].length) {
                    boo = false;
                    break;
                }
                if (a[i][j] != b[i][j]) {
                    boo = false;
                    break;
                }
            }
            if (!boo)
                break;
        }
            if (boo){
                System.out.println("两个数组相同");
            }else{
                System.out.println("两个数组不相同");
            }
    }
}
